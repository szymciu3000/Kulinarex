package com.example.kulinarex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.example.kulinarex.ui.main.DetailsFragment

class DetailsActivity : AppCompatActivity() {

    private lateinit var action: SearchView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val toolbar: Toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        if (savedInstanceState == null) {
            val image = intent.extras!!.getInt("image")
            val ingredients = intent.extras!!.getStringArrayList("ingredients")
            val recipe = intent.extras!!.getStringArrayList("recipe")
            val times = intent.extras!!.getIntegerArrayList("times")
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, DetailsFragment.newInstance(image,ingredients!!, recipe!!, times!!))
                .commitNow()
        }

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean{
        Toast.makeText(this,"test", Toast.LENGTH_SHORT).show()
        return true
    }

}