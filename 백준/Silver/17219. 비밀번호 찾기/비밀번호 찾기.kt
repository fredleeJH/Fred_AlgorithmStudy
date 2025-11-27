import java.io.*
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (num,count) = br.readLine().split(" ").map{it.toInt()}
    val idMap = mutableMapOf<String,String>()
    repeat(num){
        val (id, password) = br.readLine().split(" ")
        idMap[id] = password
    }
    repeat(count){
        val myId = br.readLine()
        val myPassword = idMap[myId]
        bw.write(myPassword)
        bw.newLine()
    }
    bw.flush()
    bw.close()
    br.close()
}