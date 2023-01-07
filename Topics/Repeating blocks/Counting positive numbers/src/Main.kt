fun main() {
    val times = readln().toInt()
    var count:Int = 0

    repeat(times){
        val next = readln().toInt()
        if(next > 0) count++
    }

    println(count)
}