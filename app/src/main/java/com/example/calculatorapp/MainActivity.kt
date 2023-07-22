package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BtnAdd.setOnClickListener {
            val input1 = EdtInp1.text.toString().toInt()
            val input2 = EdtInp2.text.toString().toInt()
            ResultTv1.text = (input1+input2).toString()
        }

        BtnSub.setOnClickListener {
            val input1 = EdtInp1.text.toString().toInt()
            val input2 = EdtInp2.text.toString().toInt()
            ResultTv1.text = (input1-input2).toString()
        }

        BtnDiv.setOnClickListener {
            val input1 = EdtInp1.text.toString().toInt()
            val input2 = EdtInp2.text.toString().toInt()
            ResultTv1.text = (input1/input2).toString()
        }

        BtnMul.setOnClickListener {
            val input1 = EdtInp1.text.toString().toInt()
            val input2 = EdtInp2.text.toString().toInt()
            ResultTv1.text = (input1*input2).toString()
        }
    }
}