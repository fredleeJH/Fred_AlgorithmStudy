fun main() {
    val count = readln().toInt()
    val grade = readln().split(" ")
    val list = arrayListOf<Int>()
    for (i in grade) {
        list.add(i.toInt())
    }
    val max = list.max()
    var result = 0.0
    for (i in list) {
        result += (i.toDouble() / max.toDouble()) * 100
    }
    println((result / count))
}