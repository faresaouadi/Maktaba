package com.eloueduniv.maktaba.presentation.book

sealed class BookUiAction {
    object RefreshBooks : BookUiAction()
    object OnAddBookClick : BookUiAction()
    object OnDismissAddBook : BookUiAction()
    data class OnAddBookConfirm(
        val isbn: String,
        val title: String,
        val nbPages: Int
    ) : BookUiAction()
}
