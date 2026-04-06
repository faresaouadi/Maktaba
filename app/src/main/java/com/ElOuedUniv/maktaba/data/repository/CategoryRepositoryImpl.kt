package com.eloueduniv.maktaba.data.repository

import com.eloueduniv.maktaba.R
import com.eloueduniv.maktaba.data.model.Category
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class CategoryRepositoryImpl @Inject constructor() : CategoryRepository {

    private val _categoriesList = listOf(
        Category(
            id = "1",
            name = "Programming",
            description = "Books about software development and coding",
            iconRes = R.drawable.ic_launcher_foreground
        ),
        Category(
            id = "2",
            name = "Algorithms",
            description = "Books about algorithms and data structures",
            iconRes = R.drawable.ic_launcher_foreground
        ),
        Category(
            id = "3",
            name = "Databases",
            description = "Books about database design and management",
            iconRes = R.drawable.ic_launcher_foreground
        )
    )

    private val categoriesFlow = MutableSharedFlow<List<Category>>(replay = 1).apply {
        tryEmit(_categoriesList)
    }
    
    override fun getAllCategories(): Flow<List<Category>> = flow {
        delay(1000) // Simulate delay
        emitAll(categoriesFlow)
    }

    override fun getCategoryById(id: String): Category? {
        return _categoriesList.find { it.id == id }
    }
}
