import java.io.*
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    val n = br.readLine().toInt()
    
    val minHeap = PriorityQueue<Int>()
    
    repeat(n){
        val x = br.readLine().toInt()
        if ( x == 0 ){
            if ( minHeap.isEmpty() ){
                bw.write("0\n")
            } else {
                bw.write("${minHeap.poll()}\n")
            }
        } else {
            minHeap.add(x)
        }
    }
    
    bw.flush()
    bw.close()
    br.close()
}