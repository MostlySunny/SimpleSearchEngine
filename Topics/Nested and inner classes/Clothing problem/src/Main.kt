class Employee(val clothesSize: Int) {
    class Uniform {
        val uniformType = "suit"
        val uniformColor = "blue"
    }

    val uni = Uniform()

    fun printUniformInfo() {
        println("The employee wears a ${uni.uniformColor} ${uni.uniformType} in size $clothesSize")
    }
}