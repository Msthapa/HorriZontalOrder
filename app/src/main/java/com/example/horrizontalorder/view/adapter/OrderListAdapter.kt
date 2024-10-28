package com.example.horrizontalorder.view.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.horrizontalorder.databinding.OrderItemUiBinding

class OrderListAdapter() : RecyclerView.Adapter<OrderListAdapter.OrderItemUI>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderItemUI {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: OrderItemUI, position: Int) {
        TODO("Not yet implemented")
    }

    inner class OrderItemUI(binding : OrderItemUiBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind() {

        }
    }

}