package com.example.loginbasico

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnLogin = findViewById<Button>(R.id.button)
        val btnContactos=  findViewById<Button>(R.id.button2)
        btnLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnContactos.setOnClickListener {
            val intent = Intent(this, contactos::class.java)
            startActivity(intent)
        }
    }
}
