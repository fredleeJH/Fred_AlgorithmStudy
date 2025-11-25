import java.io.*
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val num = br.readLine().toInt()
    val numSet = mutableListOf<Int>()
    repeat(num){
        numSet.add(br.readLine().toInt())
    }
    val sortedList = numSet.sorted()
    for(i in sortedList){
        bw.write(i.toString())
        bw.newLine()
    }
    bw.flush()
    bw.close()
    br.close()
    
}