package com.eloueduniv.maktaba.data.model

data class Book(
    val isbn: String,
    val title: String,
    val nbPages: Int,
    val imageUrl: String? = null,
    val status: String = "To Read"
)