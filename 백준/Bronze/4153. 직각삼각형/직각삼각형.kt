import java.io.*
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    while(true){
        val output = br.readLine().split(" ").map{it.toInt()}
        if(output[0] == 0 && output[1] == 0 && output[2] == 0){
            break
        }
        val sortedOutput = output.sorted()
        val a = sortedOutput[0].toLong()
        val b = sortedOutput[1].toLong()
        val c = sortedOutput[2].toLong()
        if(a*a+b*b==c*c){
            bw.write("right")
        }else{
            bw.write("wrong")
        }
        bw.newLine()
    }
    bw.flush()
    bw.close()
    bw.close()
}