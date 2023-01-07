import kotlin.math.abs

fun main() {

    val (q1x, q1y) = readln().split(" ")
    val (q2x, q2y) = readln().split(" ")

    val isTaken =
        (abs(q1x.toInt() - q2x.toInt()) == 2 && abs(q2y.toInt() - q1y.toInt()) == 1) || (abs(q2y.toInt() - q1y.toInt()) == 2 && abs(
            q2x.toInt() - q1x.toInt()
        ) == 1)

    println(if (isTaken) "YES" else "NO")
}