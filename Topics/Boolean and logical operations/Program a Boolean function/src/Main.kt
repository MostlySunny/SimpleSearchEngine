fun main() {
    val x = readLine().toBoolean() // read other values in the same way
    val y = readLine().toBoolean()
    val z = readLine().toBoolean()

    val res = !(x && y) || (z)
    println(res)
}