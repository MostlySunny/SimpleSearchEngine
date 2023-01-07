fun main() {
    val counter = readln().toInt()
    var max = 0


    repeat(counter) {
        val next = readln().toInt()
        if (next % 4 == 0 && next > max) max = next
    }
    print(max);
}