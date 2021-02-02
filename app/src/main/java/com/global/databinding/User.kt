package com.global.databinding

import android.util.Log
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

class User(val name: String, val age: Int, val isActive: Boolean, val imageUrl: String) {

    fun invokeLogMessage() {
        Log.d(this.name, "$name is your name")
    }

    // this annotation keeps everything simple. it directly refers to imageView and we don't need to
    // pass it as a parameter we only need to pass the url
    companion object {

        @JvmStatic
        @BindingAdapter("android:loadImage")
        fun loadImage(imageView: ImageView, imageUrl: String?) {
            imageUrl?.let {
                Glide.with(imageView)
                    .load(it)
                    .into(imageView)
            }

        }
    }
}