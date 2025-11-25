import java.io.*
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val num = br.readLine().toInt()
    val wordSet = mutableSetOf<String>()
    repeat(num){
        wordSet.add(br.readLine())
    }
    val sortWord = wordSet.sortedWith(compareBy<String> {it.length}.thenBy {it})
    for(i in sortWord){
        bw.write(i)
        bw.newLine()
    }
    bw.flush()
    bw.close()
    br.close()
}
