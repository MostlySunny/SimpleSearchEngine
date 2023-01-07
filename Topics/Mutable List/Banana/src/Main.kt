fun solution(strings: MutableList<String>, str: String): MutableList<String> {
    val bananaStrings = mutableListOf<String>()
    strings.forEach { bananaStrings.add(it.replace(str, "Banana")) }
    return bananaStrings
}