import java.io.*
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val num = br.readLine().toInt()
    repeat(num){
        val S= br.readLine()
        var totalScore = 0
        var currentScore = 0
        for(char in S){
            if(char == 'O'){
                currentScore +=1
                totalScore += currentScore
            }else{
                currentScore = 0
            }
        }
        bw.write(totalScore.toString())
        bw.newLine()
    }
    bw.flush()
    bw.close()
    bw.close()
}