fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    var sum = 0
    for (x in a..b) {
        sum += x
    }
    println(sum)
}