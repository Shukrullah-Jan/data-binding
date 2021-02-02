package com.global.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.global.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val activityMainBinding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        activityMainBinding.tvData = "Hey it is very simple"

        val user = User(
            "Kamal",
            23,
            true,
            "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg"
        )

        activityMainBinding.myUser = user


    }

    /*
    *  // this is one way to handle click listener for button
    * another way from xml file
        activityMainBinding.button.setOnClickListener {

        }
        * */
}