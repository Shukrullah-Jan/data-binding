package com.global.databinding

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.global.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val activityMainBinding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        activityMainBinding.tvData = "Hey it is very simple"

        Toast.makeText(this, "hey", Toast.LENGTH_LONG).show()
        val user = User(
            "Kamal",
            23,
            true,
            "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg"
        )

        // this is only a comment and i am checking whether it is working or not.
        activityMainBinding.myUser = user


    }

    /*
    *  // this is one way to handle click listener for button
    * another way from xml file
        activityMainBinding.button.setOnClickListener {

        }
        * */
}