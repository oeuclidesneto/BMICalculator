package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat


const val KEY_RESULT_BMI = "ResultActivity.KEY_BMI"

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result = intent.getFloatExtra(KEY_RESULT_BMI, 0f)
        val tvResult = findViewById<TextView>(R.id.tv_result)
        val tvClassification = findViewById<TextView>(R.id.tv_classification)

        tvResult.text = result.toString()

        val (classification, color) =  when {
            result < 18.5f ->"UNDERWEIGHT" to R.color.red
            result > 18.5f && result <= 24.9f -> "NORMAL" to R.color.green
            result > 25.0f && result <= 29.9f -> "OVERWEIGHT" to R.color.yellow
            result > 30f && result <= 39.9f -> "OBESITY" to R.color.orange
            else -> "MORBID OBESITY" to R.color.red
        }

        tvClassification.text = classification
        tvClassification.setTextColor(ContextCompat.getColor(this, color))

    }
}