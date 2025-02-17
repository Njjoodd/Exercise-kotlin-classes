class Book(val title: String, val author: String, val yearPublished: Int)

fun main() {
    val book = Book("The Starless Sea", "Erin Morgenstern", 2019)

    println("The book is called ${book.title} by ${book.author}, and was published in ${book.yearPublished}")
}
