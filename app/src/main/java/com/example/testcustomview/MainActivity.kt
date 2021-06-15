package com.example.testcustomview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button: Button? = null
        var text_view: TextView? = null


        button = findViewById(R.id.button)
        text_view = findViewById(R.id.text_view)

        button.setOnClickListener{ text_view?.text = "Text is changed!"}
    }
}