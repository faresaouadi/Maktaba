package com.eloueduniv.maktaba.domain.usecase

import com.eloueduniv.maktaba.data.model.Book
import com.eloueduniv.maktaba.data.repository.BookRepository

class GetBookByIsbnUseCase(
    private val bookRepository: BookRepository
) {
    operator fun invoke(isbn: String): Book? {
        return bookRepository.getBookByIsbn(isbn)
    }
}
