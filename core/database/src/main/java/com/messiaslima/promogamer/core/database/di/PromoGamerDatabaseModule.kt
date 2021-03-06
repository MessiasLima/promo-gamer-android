package com.messiaslima.promogamer.core.database.di

import android.content.Context
import androidx.room.Room
import com.messiaslima.promogamer.core.database.PromoGamerDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class PromoGamerDatabaseModule {
    @Provides
    @Singleton
    fun providePromoGamerDatabase(@ApplicationContext applicationContext: Context): PromoGamerDatabase {
        return Room.databaseBuilder(
            applicationContext,
            PromoGamerDatabase::class.java,
            DATABASE_NAME
        ).build()
    }

    @Provides
    fun provideStoreDao(database: PromoGamerDatabase) = database.getStoreDao()

    companion object {
        private const val DATABASE_NAME = "PromoGamerDatabase"
    }
}
