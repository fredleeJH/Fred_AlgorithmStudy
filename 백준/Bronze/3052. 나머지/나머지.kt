import java.io.*
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val newSet = mutableSetOf<Int>()
    repeat(10){
        val num = br.readLine().toInt()
        val remainNum = num % 42
        newSet.add(remainNum)
    }
    bw.write(newSet.size.toString())
    bw.flush()
    bw.close()
    bw.close()
}