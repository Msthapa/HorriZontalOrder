package com.example.horrizontalorder.model.room.entity

import androidx.room.Embedded
import androidx.room.Relation
import com.example.horrizontalorder.model.room.entity.OrderedFoodEntity

data class UserOrderWithFood(
    @Embedded val userOrderData: UserOrderData,
    @Relation(
        parentColumn = "orderId",
        entityColumn = "userOrderId"
    )
    val orderedFoods: List<OrderedFood>
)
