fun main() {
    val size = readln().toInt()
    val ls = MutableList(size) { readln().toInt() }
    val last = readln().toInt()
    println(if (ls.indexOf(last) != -1) "YES" else "NO")

}