import java.io.*
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    val n = br.readLine().toInt()
    val meetings = mutableListOf<Pair<Int,Int>>()
    
    repeat(n){
        val st = StringTokenizer(br.readLine())
        val start = st.nextToken().toInt()
        val end = st.nextToken().toInt()
        meetings.add(Pair(start,end))
    }
    
    meetings.sortWith(compareBy({it.second}, {it.first}))
    
    var count = 0
    var lastEndTime = 0
    
    for(meeting in meetings){
        if(meeting.first >= lastEndTime){
            lastEndTime = meeting.second
            count++
        }
    }
    
    bw.write("$count")
    bw.flush()
    bw.close()
    br.close()
}