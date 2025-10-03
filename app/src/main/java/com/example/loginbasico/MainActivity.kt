package com.example.loginbasico

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usuarios = mapOf(
            "crisabuhadba@gmail.com" to "cris",
            "fulano@gmail.com" to "321",
            "manuelito@gmail.com" to "986"
        )

        val etEmail = findViewById<EditText>(R.id.email)
        val etPassword = findViewById<EditText>(R.id.password)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()


            val usuarioVerificado = usuarios[email] == password

            if (usuarioVerificado) {
                Toast.makeText(this, "Login exitoso ", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Incorrecto o la cuenta no existe", Toast.LENGTH_SHORT).show()
            }
        }}}
