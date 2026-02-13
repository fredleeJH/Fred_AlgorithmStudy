import java.io.*
import java.util.*

data class Node(val dest: Int, val weight: Int)
data class Result(val node: Int, val dist: Int)

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    val n = br.readLine().toInt()
    
    val adj = Array(n+1){mutableListOf<Node>()}
    
    if(n == 1){
        println(0)
        return
    }
    repeat(n-1){
        val st = StringTokenizer(br.readLine())
        val u = st.nextToken().toInt()
        val v = st.nextToken().toInt()
        val w = st.nextToken().toInt()
        adj[u].add(Node(v,w))
        adj[v].add(Node(u,w))
    }
    
    val firstBfs = bfs(1,n,adj)
    
    val secondBfs = bfs(firstBfs.node,n,adj)
    
    
    bw.write(secondBfs.dist.toString())
    bw.flush()
    bw.close()
}

fun bfs(start: Int, n: Int, adj: Array<MutableList<Node>>): Result {
    val dists = IntArray(n+1) {-1}
    val queue = ArrayDeque<Int>()
    
    queue.addLast(start)
    dists[start] = 0
    
    var maxDist = 0
    var furthestNode = start
    
    while(queue.isNotEmpty()){
        val current = queue.removeFirst()
        if(dists[current] > maxDist){
            maxDist = dists[current]
            furthestNode = current
        }
        
        for(node in adj[current]){
           if(dists[node.dest] == -1 ){
              dists[node.dest] = dists[current] + node.weight
              queue.addLast(node.dest)
           }
        }
        
    }
    
    return Result(furthestNode, maxDist)
}