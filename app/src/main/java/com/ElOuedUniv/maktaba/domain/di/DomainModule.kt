package com.eloueduniv.maktaba.domain.di

import com.eloueduniv.maktaba.data.repository.BookRepository
import com.eloueduniv.maktaba.data.repository.CategoryRepository
import com.eloueduniv.maktaba.domain.usecase.AddBookUseCase
import com.eloueduniv.maktaba.domain.usecase.GetBooksUseCase
import com.eloueduniv.maktaba.domain.usecase.GetCategoriesUseCase
import com.eloueduniv.maktaba.domain.usecase.GetBookByIsbnUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DomainModule {

    @Provides
    @Singleton
    fun provideGetCategoriesUseCase(
        categoryRepository: CategoryRepository
    ): GetCategoriesUseCase {
        return GetCategoriesUseCase(categoryRepository)
    }

    @Provides
    @Singleton
    fun provideGetBooksUseCase(
        bookRepository: BookRepository
    ): GetBooksUseCase {
        return GetBooksUseCase(bookRepository)
    }

    @Provides
    @Singleton
    fun provideAddBookUseCase(
        bookRepository: BookRepository
    ): AddBookUseCase {
        return AddBookUseCase(bookRepository)
    }

    @Provides
    @Singleton
    fun provideGetBookByIsbnUseCase(
        bookRepository: BookRepository
    ): GetBookByIsbnUseCase {
        return GetBookByIsbnUseCase(bookRepository)
    }
}
