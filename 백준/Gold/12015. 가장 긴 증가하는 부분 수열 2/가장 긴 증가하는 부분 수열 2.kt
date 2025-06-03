package week5

fun main() {
    val n = readln().toInt()
    val a = readln().split(" ").map { it.toInt() }

    val lis = mutableListOf<Int>()

    for (x in a) {
        val idx = lis.binarySearch(x)
        if (idx < 0) {
            val insertIdx = -(idx + 1)
            if (insertIdx == lis.size) lis.add(x)  else lis[insertIdx] = x
        }
    }

    println(lis.size)
}