package com.app.nytimes.manager.utilities

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.app.nytimes.R
import kotlinx.android.synthetic.main.activity_main.*


@SuppressLint("RestrictedApi")
fun AppCompatActivity.toolBarVisibility(isVisible: Boolean){

    supportActionBar?.setBackgroundDrawable(
         ColorDrawable(Color.WHITE)
    )

    supportActionBar?.elevation = 0F
    supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_monetization_on_24)
    supportActionBar?.setShowHideAnimationEnabled(true)




    val text: Spannable = SpannableString(supportActionBar?.title)
    text.setSpan(
        ForegroundColorSpan(Color.BLACK),
        0,
        text.length,
        Spannable.SPAN_INCLUSIVE_INCLUSIVE
    )
    supportActionBar?.title = text


    when(isVisible){
        true ->{
            supportActionBar?.show()
            bottom_nav_view.isVisible = true
        }
        false ->{
            supportActionBar?.hide()
            bottom_nav_view.isVisible = false
        }
    }
}

fun AppCompatActivity.bottomNavigationVisibility(isVisible: Boolean){

    when(isVisible){
        true ->{
            bottom_nav_view.isVisible = true
        }
        false ->{
            bottom_nav_view.isVisible = false
        }
    }
}

