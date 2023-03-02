package com.example.groceryapplication

class GroceryRepository (private val  db :GroceryDatabase){


    suspend fun insert(item:GroceryItems)= db.getGrocery().insert(item)
    suspend fun delete(item:GroceryItems)= db.getGrocery().delete(item)

       fun getAllItems() = db.getGrocery().getAllGroceryItems()
}