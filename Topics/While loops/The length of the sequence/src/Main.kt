fun main() {
    // put your code here
    var length = 0;

    do {
        val next = readln().toInt()
        length++
    } while (next != 0)

    println(--length)
}