package com.example.kotlinstudy

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val num1 = br.readLine()
    val num2 = br.readLine()
    val num3 = br.readLine()
    bw.write((num1.toInt() + num2.toInt() - num3.toInt()).toString())
    bw.newLine()
    bw.write(((num1 + num2).toInt() - num3.toInt()).toString())
    bw.flush()
    bw.close()
    bw.close()
}
