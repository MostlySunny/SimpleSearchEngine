fun main() {
    val caps = readln().toInt()
    val isWeekend = readln().toBoolean()

    println((isWeekend && caps >= 15 && caps <= 25) || (!isWeekend && caps >= 10 && caps <= 20))
}