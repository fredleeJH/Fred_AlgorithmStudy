import java.io.*
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val num = br.readLine().toInt()
    val hashCode = br.readLine()
    val R = 31L
    val M = 1234567891L
    var res = 0L
    var currentR = 1L
    repeat(num){
        res += (hashCode[it]-'a' +1)*currentR % M
        currentR = currentR * R % M
    }
    bw.write((res % M).toString())
    bw.flush()
    bw.close()
    br.close()
    
}