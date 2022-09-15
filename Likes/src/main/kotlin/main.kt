fun main() {
    val likes: Int = 1011
    val lastCharakter: Int = likes % 10
    val not11End = likes % 100
    if (likes === 11 || lastCharakter !== 1|| not11End === 11) {
        println("Понравилось " + likes + " Людям")
    } else {
        println("Понравилось " + likes + " Человеку")
    }

}


