fun main() {
    val size = readln().toInt()
    val arr = MutableList(size) { readln().toInt() }
    val di = readln().split(" ").map { it.toInt() }.toMutableList()
    println(if (arr.contains(di[0]) && arr.contains(di[1])) "YES" else "NO")
}