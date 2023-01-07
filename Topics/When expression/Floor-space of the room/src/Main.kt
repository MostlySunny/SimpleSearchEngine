import kotlin.math.*

fun main() {

    when (readln()) {
        "triangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            val c = readln().toDouble()

            val p = (a + b + c) / 2
            val s = sqrt(p * (p - a) * (p - b) * (p - c))

            println(s)
        }

        "rectangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            val s = a * b
            println(s)
        }

        "circle" -> {
            val a = readln().toDouble()
            val s = (a*a) * 3.14
            println(s)
        }

    }

}