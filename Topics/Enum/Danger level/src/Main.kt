enum class DangerLevel(val lev: Int) {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    fun getLevel(): Int {
        return lev
    }
}
