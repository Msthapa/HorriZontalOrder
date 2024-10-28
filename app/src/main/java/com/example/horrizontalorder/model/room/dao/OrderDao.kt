package com.example.horrizontalorder.model.room.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.example.horrizontalorder.model.room.entity.UserOrderData
import com.example.horrizontalorder.model.room.entity.UserOrderWithFood

@Dao
interface OrderDao {

    //For fetching  all type or order, in ascending time
    @Transaction
    @Query("SELECT * FROM user_order_data ORDER BY time ASC")
    suspend fun getUserOrdersWithFoods(): List<UserOrderWithFood>


    @Query("SELECT * FROM user_order_data WHERE orderType = :orderType")
    fun getOrdersByType(orderType: Int): List<UserOrderData>

    @Dao
    interface UserOrderDao {
        @Query("SELECT * FROM user_order_data WHERE isCompleted = :status")
        fun getOrdersByCompletionStatus(status: Boolean): List<UserOrderData>
    }

}