import kotlin.math.abs

fun main() {
    val size = readln().toInt()
    val arr = MutableList(size) { readln().toInt() }
    val di = readln().split(" ").map { it.toInt() }.toMutableList()
    var inRange = false

    for (x in 0 until arr.size-1) {
        if ((di[0] == arr[x] && di[1] == arr[x + 1]) || (di[1] == arr[x] && di[0] == arr[x + 1])) {
            inRange = true
        }
    }

    println(if (inRange) "NO" else "YES")
}