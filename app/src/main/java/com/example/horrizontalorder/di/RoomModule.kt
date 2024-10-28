package com.example.horrizontalorder.di

import android.content.Context
import androidx.room.Room
import com.example.horrizontalorder.model.OrderDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Provides
    @Singleton
    fun provideOrderDatabase(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, OrderDatabase::class.java, "order.db").build()

    @Provides
    fun provideOrderDAO(orderDatabase: OrderDatabase) = orderDatabase.orderDao()
}