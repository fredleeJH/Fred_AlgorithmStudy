import java.io.*
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    val n = br.readLine().toInt()
    val adj = Array(n+1) {mutableListOf<Int>()}
    for (i in 0 until n-1){
        val st = StringTokenizer(br.readLine())
        val u = st.nextToken().toInt()
        val v = st.nextToken().toInt()
        adj[u].add(v)
        adj[v].add(u)
    }
    val parent = IntArray(n+1)
    val queue = ArrayDeque<Int>()
    
    
    queue.addLast(1) //루트 노드 선정
    parent[1] = -1 //방문 표시
    
    while(queue.isNotEmpty()){
        val current = queue.removeFirst()
        for (next in adj[current]){
            if (parent[next] == 0){
                parent[next] = current
                queue.addLast(next)
            }
        }
    }
    
    for (i in 2..n) {
        bw.write("${parent[i]}\n")
    }
    
    bw.flush()
    bw.close()
}