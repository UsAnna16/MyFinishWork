package com.example.myfinishwork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ForthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forth)
        val button: Button = findViewById(R.id.jump4)
        button.setOnClickListener {
            intent = Intent(this, FifthActivity::class.java)
            startActivity(intent)
        }
    }
}