import java.io.*
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val num = br.readLine().toInt()
    var ageList = ArrayList<Pair<Int,String>>()
    repeat(num){
        val source = br.readLine().split(" ")
        ageList.add(Pair(source[0].toInt(), source[1]))
    }
    val sortedList = ageList.sortedWith(compareBy{it.first})
    for(i in 0 until num){
       bw.write("${sortedList[i].first} ${sortedList[i].second}")
        bw.newLine()
    }
    bw.flush()
    bw.close()
    br.close()
}