package com.ElOuedUniv.maktaba.presentation.book

/**
 * One-time UI events (System events) for the Book screen.
 */
sealed interface BookUiEvent {
    data class ShowSnackbar(val message: String) : BookUiEvent
    data class ShowToast(val message: String) : BookUiEvent
    object NavigateToCategories : BookUiEvent
}
