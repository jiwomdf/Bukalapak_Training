package com.katilijiwo.latihan2.di

import com.katilijiwo.latihan2.data.Repository
import com.katilijiwo.latihan2.data.RepositoryImpl
import com.katilijiwo.latihan2.data.remote.services.BukalapakServices
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideRepository(bukalapakServices: BukalapakServices): Repository {
        return RepositoryImpl(bukalapakServices)
    }
}