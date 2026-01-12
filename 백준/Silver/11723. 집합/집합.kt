import java.io.*
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    var s = 0
    
    val n = br.readLine().toInt()
    repeat(n){
        val cmd = br.readLine().split(" ")
        val op = cmd[0]
        when(op){
            "add" -> {
                val x = cmd[1].toInt()
                s = s or (1 shl (x-1))
            }
            "remove" -> {
                val x = cmd[1].toInt()
                s = s and (1 shl (x-1)).inv()
            }
            "check" -> {
                val x = cmd[1].toInt()
                if ((s and (1 shl (x - 1))) != 0) {
                    bw.write("1\n")
                } else {
                    bw.write("0\n")
                }
            }
            "toggle" -> {
                val x = cmd[1].toInt()
                s = s xor (1 shl (x-1))
            }
            "all" -> {
                s = (1 shl 20) - 1
            }
            "empty" -> {
                s = 0
            }
        }
    }
    bw.flush()
    bw.close()
    br.close()
    
}