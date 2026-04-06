package com.eloueduniv.maktaba.data.repository

import com.eloueduniv.maktaba.data.model.Category
import kotlinx.coroutines.flow.Flow

interface CategoryRepository {
    
    fun getAllCategories(): Flow<List<Category>>
    
    fun getCategoryById(id: String): Category?
}
