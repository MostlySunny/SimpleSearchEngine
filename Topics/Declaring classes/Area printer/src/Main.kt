class Rectangle(val width: Int, val height: Int)

val rectangle = Rectangle(100, 200)

fun printArea(rectangle: Rectangle) {
    println(rectangle.height * rectangle.width)
}