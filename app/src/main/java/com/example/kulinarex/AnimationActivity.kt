package com.example.kulinarex

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kulinarex.AnimationFragment



class AnimationActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)
        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .replace(R.id.animation_container, AnimationFragment.newInstance())
                .commitNow()
        }
    }
}



