fun main() {
    // write your code here
    val dna = readln().lowercase()
    var cnt = 0
    for (i in dna) {
        if (i.code == 99 || i.code == 103) {
            cnt++
        }
    }
    println((cnt.toDouble() / dna.length) * 100)
}