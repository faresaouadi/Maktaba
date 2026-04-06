package com.eloueduniv.maktaba.presentation.book

import com.eloueduniv.maktaba.data.model.Book

data class BookUiState(
    val books: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val errorMessage: String? = null
)
