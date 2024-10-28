package com.example.horrizontalorder.view

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.horrizontalorder.viewModel.MyOrdersViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MyOrdersActivity : AppCompatActivity() { // for back-ward compatibility support

    private  val mViewModel : MyOrdersViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

    }
}