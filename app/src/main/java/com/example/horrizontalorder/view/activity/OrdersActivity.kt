package com.example.horrizontalorder.view.activity

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.horrizontalorder.databinding.ActivityOrderBinding
import com.example.horrizontalorder.viewModel.OrdersViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OrdersActivity : AppCompatActivity() { // for back-ward compatibility support

    private  val mViewModel : OrdersViewModel by viewModels()
    private lateinit var mBinding : ActivityOrderBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
         mBinding = ActivityOrderBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }
}