import kotlin.math.*

fun main() {
    var (q1x, q1y) = readln().split(" ")
    var (q2x, q2y) = readln().split(" ")

    val is90: Boolean = abs(q2x.toInt() - q1x.toInt()) == abs(q2y.toInt() - q1y.toInt())

    if (q1x == q2x || q1y == q2y || is90) {
        print("YES")
    } else {
        print("NO")
    }

}