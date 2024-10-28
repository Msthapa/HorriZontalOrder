package com.example.horrizontalorder.model.room.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.example.horrizontalorder.model.data.ui.UserOrderData

@Entity(
    tableName = "ordered_food",
    foreignKeys = [
        ForeignKey(
            entity = UserOrderData::class,
            parentColumns = ["orderId"],
            childColumns = ["userOrderId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class OrderedFood(
    @PrimaryKey(autoGenerate = true) val foodId: Long = 0,
    val name: String,
    val dos: List<String>,
    val dont: List<String>,
    val userOrderId: Long, // Foreign key to UserOrderData
)