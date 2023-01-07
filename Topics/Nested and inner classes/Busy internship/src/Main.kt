class Intern(val weeklyWorkload: Int) {
    val baseWorkload = 20
    val extra = if (weeklyWorkload > baseWorkload) weeklyWorkload - baseWorkload else 0

    class Salary {
        val basePay = 50
        val extraHoursPay = 2.8
    }

    val salary = Salary()

    val weeklySalary = salary.basePay + salary.extraHoursPay * extra
}