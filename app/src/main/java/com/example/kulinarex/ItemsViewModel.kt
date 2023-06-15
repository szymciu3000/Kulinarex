package com.example.kulinarex

data class ItemsViewModel(val recipe_name: String, val recipe_image: Int, val recipe_ingredients: ArrayList<String>, val recipe: ArrayList<String>,val times: ArrayList<Int>){
}