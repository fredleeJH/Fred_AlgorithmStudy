import java.io.*
fun main(args: Array<String>) {
   val br = BufferedReader(InputStreamReader(System.`in`))
   val bw = BufferedWriter(OutputStreamWriter(System.out))
   
   val result = br.readLine().split(" ").map{it.toInt()}
   var output = ""
   if(result == List(8){it+1}){
   output = "ascending"
   }else if(result == List(8){8-it}){
   output = "descending"
   }else{
   output = "mixed"
   }
   bw.write(output)
   bw.flush()
   bw.close()
   bw.close()
}