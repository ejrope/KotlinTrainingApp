package com.ejrope.kotlintrainingapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //lambda
        button.setOnClickListener {
            val text = editText.text
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }
    }
}
