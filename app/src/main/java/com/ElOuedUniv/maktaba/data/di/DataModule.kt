package com.eloueduniv.maktaba.data.di

import com.eloueduniv.maktaba.data.repository.BookRepository
import com.eloueduniv.maktaba.data.repository.BookRepositoryImpl
import com.eloueduniv.maktaba.data.repository.CategoryRepository
import com.eloueduniv.maktaba.data.repository.CategoryRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideCategoryRepository(
        categoryRepositoryImpl: CategoryRepositoryImpl
    ): CategoryRepository {
        return categoryRepositoryImpl
    }

    @Provides
    @Singleton
    fun provideBookRepository(
        bookRepositoryImpl: BookRepositoryImpl
    ): BookRepository {
        return bookRepositoryImpl
    }
}
