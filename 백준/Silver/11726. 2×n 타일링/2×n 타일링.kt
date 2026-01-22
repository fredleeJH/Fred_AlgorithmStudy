import java.io.*
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    val n = br.readLine().toInt()
    
    val dp = IntArray(1001)
    
    dp[1] = 1
    dp[2] = 2
    
    for(i in 3..n){
        dp[i] = (dp[i-1] + dp[i-2]) % 10007
    }
    
    bw.write("${dp[n]}")
    bw.flush()
    bw.close()
    br.close()
}