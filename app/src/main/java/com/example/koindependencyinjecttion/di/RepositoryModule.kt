package com.example.koindependencyinjecttion.di

import com.example.koindependencyinjecttion.data.repository.MyRepositoryImpl
import com.example.koindependencyinjecttion.domain.repository.MyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindRepository(
        myRepositoryImpl: MyRepositoryImpl
    ):MyRepository
}