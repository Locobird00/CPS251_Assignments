package com.locobird00.tipcalculatorproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.locobird00.tipcalculatorproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun calculateTips(view: View) {

        if (binding.billAmount.text.isNotEmpty()) {

            val billValue = binding.billAmount.text.toString().toFloat()

            val tenPercent = "%.2f".format(billValue * 1.10f)
            val fifteenPercent = "%.2f".format(billValue * 1.15f)
            val twentyPercent = "%.2f".format(billValue * 1.20f)

            val tipsString = getString(R.string.tips_string) + "\n \n 10% = $tenPercent \n 15% = $fifteenPercent \n 20% = $twentyPercent"

            binding.tipsView.text = tipsString

        } else {
            binding.tipsView.text = getString(R.string.no_value_string)
        }
    }
}