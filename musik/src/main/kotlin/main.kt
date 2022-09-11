fun main(){
    val itemPrice = 1000
    val itemCount = 11
    val standartDiscount = 100
    val discountStart = 1000
    val musikLover = true
    val totalPrice = itemPrice * itemCount
    val specialDiscount = (totalPrice / 100) * 5
    fun calcDiscount(totalPrise: Int): Int{if(totalPrice <= discountStart){
        return totalPrise} else if( totalPrice > discountStart && totalPrice < 10001){
            val totalPrice1 = totalPrice - standartDiscount
        return totalPrice1
    } else{ val totalPrice2 = totalPrice - specialDiscount
    return  totalPrice2}}
    val sum = calcDiscount(totalPrice)
    val loverDiscount = (sum / 100)
    if( musikLover === true){
        val sum1 = sum - loverDiscount
        println("Итоговая сумма: " + sum1)
    }else { println("Итговая сумма: " + sum)}
}