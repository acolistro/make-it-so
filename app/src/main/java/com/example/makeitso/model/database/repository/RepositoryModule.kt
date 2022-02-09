package com.example.makeitso.model.database.repository

import com.example.makeitso.model.database.repository.impl.TaskRepositoryImpl
import com.example.makeitso.model.database.repository.impl.UserRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
abstract class RepositoryModule {
    @Binds
    abstract fun provideTaskRepository(impl: TaskRepositoryImpl): TaskRepository

    @Binds
    abstract fun provideUserRepository(impl: UserRepositoryImpl): UserRepository
}