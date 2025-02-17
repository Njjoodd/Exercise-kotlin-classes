class Book {
    var title: String = ""
    var author: String = ""
    var yearPublished: Int = 0
}

fun main() {
    val book = Book()
    book.title = "The starless sea"
    book.author = "Erinn Morgenstrern"
    book.yearPublished = 2019

    println("The book is called ${book.title} by ${book.author}, and was published in ${book.yearPublished}")
}

