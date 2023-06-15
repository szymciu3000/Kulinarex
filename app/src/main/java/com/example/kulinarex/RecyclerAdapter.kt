package com.example.kulinarex

import android.content.ClipData.Item
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView


class RecyclerAdapter(private val mList: List<ItemsViewModel>): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_design, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = mList[position]
        holder.imageView.setImageResource(ItemsViewModel.recipe_image)
        holder.textView.text = ItemsViewModel.recipe_name
        holder.view.setOnClickListener(View.OnClickListener { view ->
            val go_to_details = Intent(holder.view.context,DetailsActivity::class.java)
            go_to_details.putExtra("image",ItemsViewModel.recipe_image)
            go_to_details.putExtra("ingredients",ItemsViewModel.recipe_ingredients)
            go_to_details.putExtra("recipe",ItemsViewModel.recipe)
            go_to_details.putExtra("times",ItemsViewModel.times)
            startActivity(holder.view.context,go_to_details, Bundle())
        })
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val textView: TextView = itemView.findViewById(R.id.textView)
        val view: View = ItemView
    }
}