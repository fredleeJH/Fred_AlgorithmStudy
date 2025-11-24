import java.io.*

fun main(args: Array<String>) { 
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val num = br.readLine().toInt()
    repeat(num){
        val input = br.readLine().split(" ")
        val R = input[0].toInt()
        val S = input[1]
        val result = S.map{it.toString().repeat(R)}.joinToString("")
        bw.write(result.toString())
        bw.newLine()
    }
    bw.flush()
    bw.close()
    bw.close()
}