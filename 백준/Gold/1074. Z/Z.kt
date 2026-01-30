import java.io.*
import java.util.*

var count = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))
    
    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val r = st.nextToken().toInt()
    val c = st.nextToken().toInt()
    
    val size = 1 shl n
    
    solve(size, r, c)
    
    bw.write(count.toString())
    bw.flush()
    bw.close()
}

fun solve(size: Int, r: Int, c: Int) {
    if (size == 1) return
    
    val half = size / 2
    val area = half * half

    if (r < half && c < half) {
        solve(half, r, c)
    } else if (r < half && c >= half) {
        count += area
        solve(half, r, c - half)
    } else if (r >= half && c < half) {
        count += area * 2
        solve(half, r - half, c)
    } else {
        count += area * 3
        solve(half, r - half, c - half)
    }
}