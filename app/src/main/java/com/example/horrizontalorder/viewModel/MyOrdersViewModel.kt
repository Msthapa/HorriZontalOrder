package com.example.horrizontalorder.viewModel


import androidx.lifecycle.ViewModel
import com.example.horrizontalorder.useCase.SaveOrderUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyOrdersViewModel @Inject constructor(private val saveOrderUseCase: SaveOrderUseCase) :
    ViewModel() {

}