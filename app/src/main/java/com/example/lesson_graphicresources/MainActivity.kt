package com.example.lesson_graphicresources

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.imageView)
        imageView.visibility = View.INVISIBLE

        val textView: TextView = findViewById(R.id.textView)

        textView.setOnClickListener {
            imageView.visibility = View.VISIBLE
            imageView.setImageResource(R.mipmap.ic_launcher)
            val animation1 = AnimationUtils.loadAnimation(applicationContext, R.anim.animation2)
            imageView.startAnimation(animation1)
        }
    }
}