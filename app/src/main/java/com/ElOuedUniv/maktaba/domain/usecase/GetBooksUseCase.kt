package com.eloueduniv.maktaba.domain.usecase

import com.eloueduniv.maktaba.data.model.Book
import com.eloueduniv.maktaba.data.repository.BookRepository
import kotlinx.coroutines.flow.Flow

class GetBooksUseCase(
    private val bookRepository: BookRepository
) {
    operator fun invoke(): Flow<List<Book>> {
        return bookRepository.getAllBooks()
    }
}
