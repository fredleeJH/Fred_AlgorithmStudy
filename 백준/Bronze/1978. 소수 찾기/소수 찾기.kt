import java.io.*
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val num = br.readLine()
    val output = br.readLine().split(" ").map{it.toInt()}
    var totalCount = 0
    for(i in output){
        var cnt = 0
        for(j in 1..i){
            if(i%j == 0){
                cnt++
            }
        }
        if(cnt == 2){
                totalCount++
            }
    }
    bw.write(totalCount.toString())
    bw.flush()
    bw.close()
    bw.close()
}