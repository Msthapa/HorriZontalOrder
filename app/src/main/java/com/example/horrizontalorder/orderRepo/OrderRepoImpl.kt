package com.example.horrizontalorder.orderRepo

import com.example.horrizontalorder.model.dao.OrderDao
import javax.inject.Inject

class OrderRepoImpl @Inject constructor(private val orderDao: OrderDao): OrderRepo {

    override fun saveOrderList() {
        TODO("Not yet implemented")
    }
}