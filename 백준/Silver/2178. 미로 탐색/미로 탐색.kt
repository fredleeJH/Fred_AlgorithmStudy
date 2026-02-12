import java.io.*
import java.util.*

data class Miro(val r: Int, val c: Int)

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    val st = StringTokenizer(br.readLine())
    
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    
    val maze = Array(n) {IntArray(m)}
    val dist = Array(n) {IntArray(m) {0}}
    
    val queue = ArrayDeque<Miro>()
    
    for(i in 0 until n){
        val line = br.readLine()
        for(j in 0 until m){
           maze[i][j] = line[j].digitToInt()
        }
    }
    
    dist[0][0] = 1
    queue.addLast(Miro(0,0))
    
    val dr = intArrayOf(-1,1,0,0)
    val dc = intArrayOf(0,0,-1,1)
    
    while(queue.isNotEmpty()){
        val current = queue.removeFirst()
        if(current.r == n-1 && current.c == m-1) break
        for(i in 0 until 4){
            val nextR = current.r + dr[i]
            val nextC = current.c + dc[i]
            
            if(nextR in 0 until n && nextC in 0 until m){
                if(maze[nextR][nextC] == 1 && dist[nextR][nextC] == 0){
                    dist[nextR][nextC] = dist[current.r][current.c]+1
                    queue.addLast(Miro(nextR,nextC))
                }
            }
        }
    }
    
    bw.write(dist[n-1][m-1].toString())
    
    bw.flush()
    bw.close()
    
    
}