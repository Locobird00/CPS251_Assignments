package com.locobird00.rvproject

import androidx.lifecycle.ViewModelProvider

class Data {

    companion object {

        private val titles = arrayOf("Chapter One", "Chapter Two", "Chapter Three", "Chapter Four",
            "Chapter Five", "Chapter Six", "Chapter Seven", "Chapter Eight")

        private val details = arrayOf("Item one details", "Item two details", "Item three details",
            "Item four details", "Item five details", "Item six details", "Item seven details",
            "Item eight details")

        private val images = intArrayOf(R.drawable.android_image_1, R.drawable.android_image_2,
            R.drawable.android_image_3, R.drawable.android_image_4, R.drawable.android_image_5,
            R.drawable.android_image_6, R.drawable.android_image_7, R.drawable.android_image_8)

        var viewModel = MainViewModel

        fun createArrays() {

            for (i in 0..7) {
                viewModel.setValues(titles.random(), details.random(), images.random())
            }
        }
    }
}