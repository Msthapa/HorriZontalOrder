package com.example.horrizontalorder.di

import com.example.horrizontalorder.model.room.dao.OrderDao
import com.example.horrizontalorder.orderRepo.OrderRepo
import com.example.horrizontalorder.orderRepo.OrderRepoImpl
import com.example.horrizontalorder.useCase.SaveOrderUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class OrderRepoModule {

    @Provides
    fun provideOrderRepo(orderDao: OrderDao) : OrderRepo {
        return OrderRepoImpl(orderDao)
    }

    @Provides
    fun provideSaveOrderUseCase(orderRepo: OrderRepo) = SaveOrderUseCase(orderRepo)

}