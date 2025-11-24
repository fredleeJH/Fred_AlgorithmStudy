package com.example.kotlinstudy

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (hour, minute) = br.readLine().split(" ").map { it.toInt() }

    var alertMin = minute
    var alertHour = hour

    if (minute - 45 >= 0) {
        alertMin = minute - 45
    } else {
        alertMin = minute + 60 - 45
        alertHour = hour - 1
    }
    if (alertHour == -1) {
        alertHour = 23
    }
    bw.write("$alertHour $alertMin")
    bw.flush()
    bw.close()

}
