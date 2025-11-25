import java.io.*
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val num = br.readLine().toInt()
    val powerList = ArrayList<Pair<Int,Int>>()
    repeat(num){
        val input = br.readLine().split(" ")
        powerList.add(Pair(input[0].toInt(), input[1].toInt()))
    }
    for(i in 0 until num){
        var count = 1
        for(j in 0 until num){
            if(powerList[i].first<powerList[j].first && powerList[i].second<powerList[j].second){
                count++
            }
        }
        bw.write(count.toString())
        bw.write(" ")
    }
    bw.flush()
    bw.close()
    br.close()
}