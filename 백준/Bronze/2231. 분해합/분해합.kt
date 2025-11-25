import java.io.*
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val num = br.readLine().toInt()
    var generator = 0
    for(i in 1 until num){
        var sum = i
        var j = i
        while(j>0){
            sum += j%10
            j/=10
        }
        if(sum == num){
           generator = i
            break
        }
    }
    bw.write(generator.toString())
    bw.flush()
    bw.close()
    br.close()
 
}