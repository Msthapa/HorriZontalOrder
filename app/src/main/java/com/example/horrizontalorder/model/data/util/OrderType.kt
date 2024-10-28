package com.example.horrizontalorder.model.data.util

sealed class OrderType(val value: Int, val displayName: String) {
    object DineIn : OrderType(1, "Dine-in")
    object ToGo : OrderType(2, "To Go")
    object PreOrder : OrderType(3, "Pre Order")
    object WebOrder : OrderType(4, "Web Order")

    companion object {
        //Retrieve an OrderType by its integer value
        fun fromValue(value: Int): OrderType? = when (value) {
            1 -> DineIn
            2 -> ToGo
            3 -> PreOrder
            4 -> WebOrder
            else -> null
        }

        //Retrieve an OrderType by its display name
        fun fromDisplayName(displayName: String): OrderType? = when (displayName) {
            "Dine-in" -> DineIn
            "To Go" -> ToGo
            "Pre Order" -> PreOrder
            "Web Order" -> WebOrder
            else -> null
        }
    }
}