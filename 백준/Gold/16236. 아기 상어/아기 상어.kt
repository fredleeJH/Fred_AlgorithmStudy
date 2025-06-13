
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val map = Array(n) { br.readLine().split(" ").map { it.toInt() }.toIntArray() }

    val dx = intArrayOf(-1, 1, 0, 0)
    val dy = intArrayOf(0, 0, -1, 1)

    var sharkX = 0
    var sharkY = 0
    var sharkSize = 2
    var sharkEat = 0

    for (y in 0 until n) {
        for (x in 0 until n) {
            if (map[y][x] == 9) {
                sharkY = y
                sharkX = x
                map[y][x] = 0
            }
        }
    }

    var totalTime = 0
    val queue = LinkedList<Triple<Int, Int, Int>>()

    while (true) {
        val visited = Array(n) { BooleanArray(n) }
        val candidates = mutableListOf<Triple<Int, Int, Int>>()

        queue.clear()
        queue.offer(Triple(sharkY, sharkX, 0))
        visited[sharkY][sharkX] = true

        while (queue.isNotEmpty()) {
            val (y, x, dist) = queue.poll()

            for (i in 0 until 4) {
                val ny = y + dy[i]
                val nx = x + dx[i]

                if (ny in 0 until n && nx in 0 until n && !visited[ny][nx]) {
                    val target = map[ny][nx]
                    if (target <= sharkSize) {
                        visited[ny][nx] = true
                        queue.offer(Triple(ny, nx, dist + 1))
                        if (target in 1 until sharkSize) {
                            candidates.add(Triple(dist + 1, ny, nx))
                        }
                    }
                }
            }
        }

        if (candidates.isEmpty()) break

        val (minDist, targetY, targetX) = candidates.sortedWith(
            compareBy({ it.first }, { it.second }, { it.third })
        ).first()

        sharkY = targetY
        sharkX = targetX
        sharkEat++
        map[targetY][targetX] = 0
        totalTime += minDist

        if (sharkEat == sharkSize) {
            sharkSize++
            sharkEat = 0
        }
    }

    bw.write("$totalTime\n")
    bw.flush()
    bw.close()
}
