package com.example.horrizontalorder.model

import androidx.room.RoomDatabase
import com.example.horrizontalorder.model.room.dao.OrderDao

//@Database(entities[entities] = , version = 1, exportSchema = false)
abstract class OrderDatabase : RoomDatabase() {
   abstract fun orderDao() : OrderDao
}