fun main() {
    val firstList = readLine()!!.split(' ').map { it }.toMutableList()
    val secondList = readLine()!!.split(' ').map { it }.toMutableList()
    firstList.addAll(secondList)
    // do not touch the lines above
    // write your code here
    println(firstList.joinToString())
}