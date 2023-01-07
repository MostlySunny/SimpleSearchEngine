fun main() {
    val invitation = readln().toBoolean() // read other value in the same way
    val gift = readln().toBoolean()
    // write your code here
    println(if (invitation && gift) "true" else "false")
}