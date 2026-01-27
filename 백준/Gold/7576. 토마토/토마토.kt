import java.io.*
import java.util.*

data class Tomato(val r: Int, val c: Int)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))
    
    val st = StringTokenizer(br.readLine())
    val m = st.nextToken().toInt()
    val n = st.nextToken().toInt()
    
    val grid = Array(n) { IntArray(m) }
    val queue = ArrayDeque<Tomato>()

    for (i in 0 until n) {
        val line = StringTokenizer(br.readLine())
        for (j in 0 until m) {
            grid[i][j] = line.nextToken().toInt()
            if (grid[i][j] == 1) {
                queue.add(Tomato(i, j))
            }
        }
    }
    
    val dr = intArrayOf(-1, 1, 0, 0)
    val dc = intArrayOf(0, 0, -1, 1)
    
    while (queue.isNotEmpty()) {
        val current = queue.removeFirst()
        
        for (i in 0 until 4) {
            val nr = current.r + dr[i]
            val nc = current.c + dc[i]

            if (nr in 0 until n && nc in 0 until m && grid[nr][nc] == 0) {
                grid[nr][nc] = grid[current.r][current.c] + 1
                queue.add(Tomato(nr, nc))
            }
        }
    }

    var maxDays = 0
    for (i in 0 until n) {
        for (j in 0 until m) {
            if (grid[i][j] == 0) {
                bw.write("-1\n")
                bw.flush()
                bw.close()
                return
            }
            maxDays = maxOf(maxDays, grid[i][j])
        }
    }

    if (maxDays == 0) {
        bw.write("0\n")
    } else {
        bw.write("${maxDays - 1}\n")
    }
    
    bw.flush()
    bw.close()
    br.close()
}