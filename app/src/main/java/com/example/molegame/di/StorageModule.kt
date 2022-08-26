package com.example.molegame.di

import com.example.molegame.storage.SharedPreferencesStorage
import com.example.molegame.storage.Storage
import dagger.Binds
import dagger.Module

@Module
abstract class StorageModule {
    @Binds
    abstract fun provideStorage(storage: SharedPreferencesStorage): Storage
}