package com.example.kotlinstudy.bruteforce

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (num, blackJack) = br.readLine().split(" ").map { it.toInt() }
    val blackJackArray = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    var result = 0

    for (i in 0 until num - 2) {
        for (j in i + 1 until num - 1) {
            for (k in j + 1 until num) {
                val currentSum = blackJackArray[i] + blackJackArray[j] + blackJackArray[k]
                if (currentSum <= blackJack && currentSum > result) {
                    result = currentSum
                }
            }
        }
    }
    bw.write(result.toString())
    bw.flush()
    br.close()
    bw.close()
}