package com.example.horrizontalorder.model.room.entity


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_order_data")
data class UserOrderData(
    @PrimaryKey val orderId: Long,
    val receiver: String,
    val orderType: Int,   // we will store int value of order-type
    val time: Long,
    val isCompleted : Boolean,
)