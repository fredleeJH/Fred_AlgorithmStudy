import java.io.*
import java.util.*

data class ShortDist(val r: Int, val c: Int)

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt() // 세로
    val m = st.nextToken().toInt() // 가로
    
    val grid = Array(n) {IntArray(m)}
    val dist = Array(n) {IntArray(m) {-1}} // 거리 좌표계 값 -1 세팅
    
    val queue = ArrayDeque<ShortDist>()
    
    for(i in 0 until n){
        val line = StringTokenizer(br.readLine())
        for(j in 0 until m){
            grid[i][j] = line.nextToken().toInt()
            if(grid[i][j] == 2){
                dist[i][j] = 0
                queue.addLast(ShortDist(i,j))
            } else if(grid[i][j] == 0){
                dist[i][j] = 0
            }
        }
    }
    
    val dr = intArrayOf(-1,1,0,0)
    val dc = intArrayOf(0,0,-1,1)
    
    while(queue.isNotEmpty()){
        val current = queue.removeFirst()
        for(i in 0 until 4){
            val nextR = current.r + dr[i]
            val nextC = current.c + dc[i]
            
            if(nextR in 0 until n && nextC in 0 until m){
            if(grid[nextR][nextC] == 1 && dist[nextR][nextC] == -1){
                dist[nextR][nextC] = dist[current.r][current.c] + 1
                queue.addLast(ShortDist(nextR, nextC))
            }
        }
        }
    }
    
    for(i in 0 until n){
        for(j in 0 until m){
            bw.write("${dist[i][j]} ")
        }
        bw.write("\n")
    }
    
    bw.flush()
    bw.close()
    
}