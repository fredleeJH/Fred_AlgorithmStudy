package com.example.kotlinstudy

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = br.readLine().toInt()
    for (i in 1..num) {
        val space = num-i
        bw.write(" ".repeat(space))
        bw.write("*".repeat(i))
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
