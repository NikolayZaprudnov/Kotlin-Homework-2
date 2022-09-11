fun main() {
    val amount: Double = 1000.0
    val comission: Double = (amount / 100) * 0.75
    val sum: Double
    if (comission < 35) {
        sum = amount - 35
    } else {
        sum = amount - comission
    }
    println(sum)
}