package com.example.databaseexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var editTextName : EditText
    lateinit var editTextPassword : EditText
    lateinit var buttonSave : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextName = findViewById(R.id.etName)
        editTextPassword = findViewById(R.id.etPassword)
        buttonSave = findViewById(R.id.btnSave)

        buttonSave.setOnClickListener {

            val sharedPref = getSharedPreferences("log-in data " , MODE_PRIVATE)
            val editor = sharedPref.edit()
            val n = editTextName.text.toString()
            val p = editTextPassword.text.toString()
            editor.putString("Name" , n)
            editor.putString("Password" , p)
            editor.apply()

            val i = Intent( this , HomeScreen::class.java)
            startActivity(i)
        }
    }
}