package com.example.kotlinstudy

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    br.readLine()

    val num = br.readLine()

    val sum = num.sumOf { char -> char.digitToInt() }

    bw.write(sum.toString())
    bw.flush()
    bw.close()
    bw.close()

}
