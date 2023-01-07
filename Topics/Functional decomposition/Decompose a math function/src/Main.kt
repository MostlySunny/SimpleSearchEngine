fun f(x: Double): Double {
    // call your implemented functions here
    var y: Double = 0.0
    when {
        x <= 0 -> y = f1(x)
        (((x > 0) && (x < 1))) -> y = f2(x)
        x >= 1 -> y = f3(x)

    }
    return y
}

// implement your functions here
fun f1(x: Double) = x * x + 1

fun f2(x: Double) = 1 / (x * x)

fun f3(x: Double) = x * x - 1