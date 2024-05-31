package com.example.databaseexample

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeScreen : AppCompatActivity() {

    lateinit var resultTextView :TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)
        resultTextView = findViewById(R.id.tvResult)

        val sharedPref = getSharedPreferences("log-in data " , MODE_PRIVATE)
        val name =sharedPref.getString("Name", "")
        val password = sharedPref.getString("Password" ,"")

        resultTextView.text = "Name : $name  Password ; $password"
    }
}