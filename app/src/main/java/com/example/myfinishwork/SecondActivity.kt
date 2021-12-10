package com.example.myfinishwork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    val button: Button = findViewById(R.id.jump2)
        button.setOnClickListener{
            intent = Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}