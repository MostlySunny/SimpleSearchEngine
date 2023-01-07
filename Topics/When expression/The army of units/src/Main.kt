fun main() {
    val x = readln().toInt()
    when {
        x < 1 -> println("no army")
        x in 1..4 -> println("few")
        x in 5..9 -> println("several")
        x in 10..19 -> println("pack")
        x in 20..49 -> println("lots")
        x in 50..99 -> println("horde")
        x in 100..249 -> println("throng")
        x in 250..499 -> println("swarm")
        x in 500..999 -> println("zounds")
        x >= 1000 -> println("legion")
    }

}