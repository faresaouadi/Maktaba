package com.eloueduniv.maktaba.domain.usecase

import com.eloueduniv.maktaba.data.model.Book
import com.eloueduniv.maktaba.data.repository.BookRepository

class AddBookUseCase(
    private val bookRepository: BookRepository
) {
    operator fun invoke(book: Book) {
        bookRepository.addBook(book)
    }
}
