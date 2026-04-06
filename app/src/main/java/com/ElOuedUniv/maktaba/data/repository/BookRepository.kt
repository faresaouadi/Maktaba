package com.eloueduniv.maktaba.data.repository

import com.eloueduniv.maktaba.data.model.Book
import kotlinx.coroutines.flow.Flow

interface BookRepository {
    fun getAllBooks(): Flow<List<Book>>
    fun getBookByIsbn(isbn: String): Book?
    fun addBook(book: Book)
}
