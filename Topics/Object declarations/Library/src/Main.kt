object Math {
    //TODO
    fun abs(int: Int): Int {
        return if (int < 0) int * -1 else int
    }

    fun abs(double: Double): Double = if (double < 0) double * -1 else double
}