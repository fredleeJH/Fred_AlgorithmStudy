import java.io.*
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val num = br.readLine().toInt()
    var maxRoom = 1
    var step = 6
    var count = 1
    if(num == 1){
        bw.write(count.toString())
    }else{
        while(num > maxRoom){
            maxRoom += step
            count++
            step += 6
    }
           bw.write(count.toString())
    }
    bw.flush()
    bw.close()
    br.close()
}