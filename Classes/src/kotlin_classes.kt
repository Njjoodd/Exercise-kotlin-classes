class Book(val title: String, val author: String, val yearPublished: Int, val genre: String) {

    fun getBookInfo () : String {
        return "$title - $author ($yearPublished) - Genre: $genre"
    }
}
fun main() {
    val book = Book("The Starless Sea", "Erin Morgenstern", 2019, "Magical Realism")
    println(book.getBookInfo())
}
