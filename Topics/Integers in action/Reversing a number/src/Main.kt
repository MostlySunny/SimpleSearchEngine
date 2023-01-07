fun main() {
    val inp = readln().toInt()
    val first = inp / 100
    val secondPart = inp % 100
    val second = secondPart / 10
    val third = inp % 10

    print(third)
    print(second)
    print(first)
}