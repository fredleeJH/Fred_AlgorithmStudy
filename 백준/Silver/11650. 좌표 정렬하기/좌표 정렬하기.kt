import java.io.*
import java.util.*
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    
    val pointList = mutableListOf<Pair<Int,Int>>()
    
    repeat(n){
        val points = StringTokenizer(br.readLine())
        val x = points.nextToken().toInt()
        val y = points.nextToken().toInt()
        pointList.add(Pair(x,y))
    }
    
    pointList.sortWith(compareBy({it.first}, {it.second}))
    for(point in pointList){
        bw.write("${point.first} ${point.second}\n")
    }
    
    bw.flush()
    bw.close()
    br.close()
    
}