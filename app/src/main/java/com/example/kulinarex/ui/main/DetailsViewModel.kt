package com.example.kulinarex.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DetailsViewModel : ViewModel() {
    private val _recipe_image = MutableLiveData<Int>()
    private val _recipe_ingredients = MutableLiveData<ArrayList<String>>()
    private val _recipe = MutableLiveData<ArrayList<String>>()
    fun setRecipe(recipeImage:Int,recipeIngredients:ArrayList<String>, recipe:ArrayList<String>) {
        _recipe_image.value = recipeImage
        _recipe_ingredients.value = recipeIngredients
        _recipe.value = recipe

    }
}