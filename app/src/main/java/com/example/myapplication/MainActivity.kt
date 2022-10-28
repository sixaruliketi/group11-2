package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.nextButton).setOnClickListener {
            Toast.makeText(this, "congrats! you clicked!", Toast.LENGTH_SHORT).show()
        }

        findViewById<TextView>(R.id.fbLoginButton).setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }

    }
}