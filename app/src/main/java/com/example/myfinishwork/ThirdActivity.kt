package com.example.myfinishwork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)


        val button: Button = findViewById(R.id.jump3)
        button.setOnClickListener {
            intent = Intent(this, ForthActivity::class.java)
            startActivity(intent)
        }
    }
}