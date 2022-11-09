package com.example.practicecoderecreate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondd)

        val userName = intent.getStringExtra("USER")
        val textView = findViewById<TextView>(R.id.tvOff)
        val message = "You'll get a discount Mr. $userName"

        textView.text = message

    }
}