package com.eloueduniv.maktaba.data.model

import androidx.annotation.DrawableRes

data class Category(
    val id: String,
    val name: String,
    val description: String,
    @DrawableRes val iconRes: Int
)