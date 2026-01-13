import java.io.*
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    val dp = IntArray(11)
    
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4
    
    for(i in 4..10){
        dp[i] = dp[i-1]+dp[i-2]+dp[i-3]
    }
    repeat(n){
        val dpResult = br.readLine().toInt()
        bw.write("${dp[dpResult]}\n")
    }
    bw.flush()
    bw.close()
    br.close()
    
}
