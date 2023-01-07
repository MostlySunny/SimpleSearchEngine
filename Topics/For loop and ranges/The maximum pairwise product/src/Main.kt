fun main() {
    val n = readln().toInt()
    val arr = MutableList(n) { readln().toInt() }

    arr.sortDescending()

    if (arr.size == 1) println(arr[0]) else println(arr[0] * arr[1])

}