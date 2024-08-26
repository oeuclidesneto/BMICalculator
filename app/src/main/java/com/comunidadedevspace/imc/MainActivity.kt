package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtWeight = findViewById<TextInputEditText>(R.id.edt_weight)
        val edtHeight = findViewById<TextInputEditText>(R.id.edt_height)
        val btn_calculate = findViewById<Button>(R.id.btn_calculate)

        btn_calculate.setOnClickListener {
            val weight: Float = edtWeight.text.toString().toFloat()
            val height: Float = edtHeight.text.toString().toFloat()

            val heightq2 = height * height
            val result = weight / heightq2
            println ("Euclides BMI is " + result)

        }

    }
}