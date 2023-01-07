fun main() {
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    val word = readln()
    for (letter in alphabet) {
        if (word.indexOf(letter) == -1) print(letter)
    }
}