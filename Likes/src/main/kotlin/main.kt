fun main() {
    val likes: Int = 71
    val lastCharakter: Int = likes % 10
    if (likes === 11 || lastCharakter !== 1) {
        println("Понравилось " + likes + " Людям")
    } else {
        println("Понравилось " + likes + " Человеку")
    }

}