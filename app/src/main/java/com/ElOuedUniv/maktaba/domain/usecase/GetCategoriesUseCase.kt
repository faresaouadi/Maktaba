package com.eloueduniv.maktaba.domain.usecase

import com.eloueduniv.maktaba.data.model.Category
import com.eloueduniv.maktaba.data.repository.CategoryRepository
import kotlinx.coroutines.flow.Flow

// TODO: Implement this use case
class GetCategoriesUseCase(
    private val categoryRepository: CategoryRepository
) {
    operator fun invoke(): Flow<List<Category>> {
        return categoryRepository.getAllCategories()
    }
}
