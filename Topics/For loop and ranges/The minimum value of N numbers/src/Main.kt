fun main() {
    val n = readln().toInt()
    val arr = MutableList(n) { readln().toInt() }
    var min = arr[0]

    for (x in 0 until n) {
        if (min > arr[x]) min = arr[x]
    }

    println(min)
}