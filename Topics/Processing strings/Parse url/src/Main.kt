fun main() {
    // write your code here
    val url = readln()
    val params = url.split('?')[1].split('&')
    var passExist = ""

    for (param in params) {
        val keyValue = param.split('=').toMutableList()
        if (keyValue[1].isEmpty()) keyValue[1] = "not found"
        if (keyValue[0] == "pass") passExist = "password : ${keyValue[1]}"
        println("${keyValue[0]} : ${keyValue[1]}")
    }
    if (!passExist.isEmpty()) println(passExist)
}