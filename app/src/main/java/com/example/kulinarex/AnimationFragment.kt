package com.example.kulinarex

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.animation.doOnEnd
import androidx.fragment.app.Fragment


class AnimationFragment: Fragment() {

    private lateinit var mSceneView: View
    private lateinit var mBurgerUpView: View
    private lateinit var mCheeseView: View
    private lateinit var mMeatView: View
    private lateinit var mLettuceView: View
    private lateinit var mBurgerDownView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_animation,container,false)
        mSceneView = view
        mBurgerUpView = view.findViewById(R.id.burger_up)
        mCheeseView = view.findViewById(R.id.cheese)
        mMeatView = view.findViewById(R.id.meat)
        mLettuceView = view.findViewById(R.id.lettuce)
        mBurgerDownView = view.findViewById(R.id.burger_down)
        mSceneView.setOnClickListener{ startAnimation() }
        return view
    }

    private fun startAnimation(){
        val meatTop = mMeatView.top.toFloat()+mMeatView.translationY
        val meatBot = mMeatView.bottom.toFloat()+mMeatView.translationY

        val BurgerTopStart = mBurgerUpView.top.toFloat()+mBurgerUpView.translationY
        val BurgerTopEnd = meatTop-mCheeseView.height.toFloat()-mBurgerUpView.height

        val CheeseStart = mCheeseView.top.toFloat()+mCheeseView.translationY
        val CheeseEnd = meatTop-mCheeseView.height

        val LettuceStart = mLettuceView.top.toFloat()+mLettuceView.translationY
        val LettuceEnd = meatBot

        val BurgerBotStart = mBurgerDownView.top.toFloat()+mBurgerDownView.translationY
        val BurgerBotEnd = meatBot+mLettuceView.height

        val burgerUpAnimator = ObjectAnimator.ofFloat(mBurgerUpView,"y", BurgerTopStart ,BurgerTopEnd).setDuration(2000)
        val cheeseAnimator = ObjectAnimator.ofFloat(mCheeseView,"y",CheeseStart,CheeseEnd).setDuration(2000)
        val burgerDownAnimator = ObjectAnimator.ofFloat(mBurgerDownView,"y",BurgerBotStart,BurgerBotEnd).setDuration(2000)
        val lettuceAnimator = ObjectAnimator.ofFloat(mLettuceView,"y",LettuceStart,LettuceEnd).setDuration(2000)

        val animatorSet = AnimatorSet()
        animatorSet.play(burgerUpAnimator).with(cheeseAnimator).with(lettuceAnimator).with(burgerDownAnimator)
        animatorSet.start()

        animatorSet.doOnEnd {
            val intent = Intent(context, MainActivity::class.java)
            startActivity(intent)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(): AnimationFragment {
            return AnimationFragment()
        }
    }
}
