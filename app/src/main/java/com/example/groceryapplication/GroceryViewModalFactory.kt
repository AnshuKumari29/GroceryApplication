package com.example.groceryapplication

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlin.time.measureTimedValue

class GroceryViewModalFactory(private val repository: GroceryRepository):
    ViewModelProvider.NewInstanceFactory() {

        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return GroceryViewModal(repository) as T
        }
}