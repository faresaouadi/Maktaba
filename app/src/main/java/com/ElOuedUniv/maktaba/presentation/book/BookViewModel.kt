package com.eloueduniv.maktaba.presentation.book

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eloueduniv.maktaba.data.model.Book
import com.eloueduniv.maktaba.domain.usecase.AddBookUseCase
import com.eloueduniv.maktaba.domain.usecase.GetBooksUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class BookViewModel @Inject constructor(
    private val getBooksUseCase: GetBooksUseCase,
    private val addBookUseCase: AddBookUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(BookUiState())
    val uiState: StateFlow<BookUiState> = _uiState.asStateFlow()

    init {
        loadBooks()
    }

    fun loadBooks() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true) }
            getBooksUseCase()
                .catch { e ->
                    _uiState.update { it.copy(isLoading = false, errorMessage = e.message) }
                }
                .collect { bookList ->
                    _uiState.update { it.copy(isLoading = false, books = bookList) }
                }
        }
    }

    fun onAction(action: BookUiAction) {
        when (action) {
            BookUiAction.RefreshBooks -> refreshBooks()
            BookUiAction.OnAddBookClick -> {
                // Handle
            }
            BookUiAction.OnDismissAddBook -> {
                // Handle
            }
            is BookUiAction.OnAddBookConfirm -> {
                val newBook = Book(
                    isbn = action.isbn,
                    title = action.title,
                    nbPages = action.nbPages
                )
                addBookUseCase(newBook)
            }
        }
    }

    fun refreshBooks() {
        loadBooks()
    }
}
