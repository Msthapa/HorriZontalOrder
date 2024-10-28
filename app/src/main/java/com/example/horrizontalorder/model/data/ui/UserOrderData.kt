package com.example.horrizontalorder.model.data.ui

import com.example.horrizontalorder.model.data.util.OrderType

data class UserOrderData(
    val orderId : Long,
    val reciever : String,
    val orderType : OrderType,
    val time : Long,
    val itemList : List<OrderedFood>,
    val isCompleted : Boolean,
)

