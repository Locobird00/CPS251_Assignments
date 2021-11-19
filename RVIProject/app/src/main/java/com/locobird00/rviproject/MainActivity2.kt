package com.locobird00.rviproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.locobird00.rviproject.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    var data = Data.newInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val extras = intent.extras?: return

        val  titleString = extras.getInt("title")
        val  detailsString = extras.getInt("details")
        val  imageResource = extras.getInt("image")

        binding.textView.text = data.titles[titleString]
        binding.textView2.text = data.details[detailsString]
        binding.imageView.setImageResource(data.images[imageResource])
    }
}