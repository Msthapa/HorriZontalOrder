package com.example.horrizontalorder.useCase

import com.example.horrizontalorder.orderRepo.OrderRepo
import javax.inject.Inject

class SaveOrderUseCase @Inject constructor(private val repository: OrderRepo) {

    fun getUserList() {
        repository.saveOrderList()
    }
}