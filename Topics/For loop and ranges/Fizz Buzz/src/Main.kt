fun main() {
    val first = readln().toInt()
    val second = readln().toInt()

    for (i in first..second) {
        when {
            i % 3 == 0 && i % 5 != 0 -> println("Fizz")
            i % 3 == 0 && i % 5 == 0 -> println("FizzBuzz")
            i % 2 == 0 && i % 5 != 0 -> println(i)
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }
}