package com.ElOuedUniv.maktaba.data.repository

import com.ElOuedUniv.maktaba.data.model.Book

/**
 * Repository for managing book data
 * This follows the Repository pattern to abstract data sources
 */
class BookRepository {

    /**
     * TODO for Students (TP1 - Exercise 1):
     * Complete the book information for each book in the list below.
     * Add the following information for each book:
     * - isbn: Use a valid ISBN-13 format (e.g., "978-3-16-148410-0")
     * - nbPages: Add the actual number of pages
     *
     * Example:
     * Book(
     *     isbn = "978-0-13-468599-1",
     *     title = "Clean Code",
     *     nbPages = 464
     * )
     */
    private val booksList = listOf(
         Book("978-0-13-235088-4", "Clean Code", 464),
        Book("978-0-201-61622-4", "The Pragmatic Programmer", 352),
        Book("978-0-596-52068-7", "Head First Design Patterns", 694),
        Book("978-0-321-63536-5", "Effective Java", 416),
        Book("978-0-262-03384-8", "Introduction to Algorithms", 1312),
        Book("978-0-13-110362-7", "The c Progamming Language", 272),
        Book("978-1491946008", "Fluent Phython", 792),
        Book("978-0596009205", "Head First Java", 720),
        Book("978-0321573513", "Algorithms", 976),
        Book("978-1593279509", "Eloquent JavaScript", 472)
    )

    /**
     * TODO for Students (TP1 - Exercise 2):
     * Add 5 more books to the list above.
     * Choose books related to Computer Science, Programming, or any topic you like.
     * Remember to include complete information (ISBN, title, nbPages).
     *
     * Tip: You can find ISBN numbers for books on:
     * - Google Books
     * - Amazon
     * - GoodReads
     */

    /**
     * Get all books from the repository
     * @return List of all books
     */
    fun getAllBooks(): List<Book> {
        return booksList
    }

    /**
     * Get a book by ISBN
     * @param isbn The ISBN of the book to find
     * @return The book if found, null otherwise
     */
    fun getBookByIsbn(isbn: String): Book? {
        return booksList.find { it.isbn == isbn }
    }
}
