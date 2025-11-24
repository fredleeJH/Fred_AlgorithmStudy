package com.example.kotlinstudy

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val maxList = mutableListOf<Int>()

    repeat(9) {
        maxList.add(br.readLine().toInt())
    }

    val maxValue = maxList.maxOrNull()!!
    val maxIndex = maxList.indexOf(maxValue)

    bw.write(maxValue.toString())
    bw.newLine()
    bw.write((maxIndex + 1).toString())
    bw.flush()
    bw.close()
    bw.close()


}
