package com.example.calculatorapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IntegerRes
import android.widget.Button
import android.widget.EditText

// Apply layouts to make it more appealing
class MainActivity : AppCompatActivity() {

    private var textField : EditText? = null
    private var increaseByOne : Button? = null
    private var decreaseByOne : Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialseUI()

        increaseByOne!!.setOnClickListener{
            val result = Integer.parseInt(textField!!.text.toString()) + 1
            textField!!.setText(result.toString())
        }
        decreaseByOne!!.setOnClickListener{
            val result = Integer.parseInt(textField!!.text.toString()) - 1
            textField = findViewById(R.id.text)
            textField!!.setText(result.toString())
        }

    }

    private fun initialseUI(){

        textField = findViewById(R.id.text)
        increaseByOne = findViewById(R.id.button1)
        decreaseByOne = findViewById(R.id.button2)
    }
}
