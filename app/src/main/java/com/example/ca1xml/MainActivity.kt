package com.example.ca1xml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSignIn = findViewById<Button>(R.id.btnSignIn)
        val qrImage = findViewById<ImageView>(R.id.qrImage)

        btnSignIn.setOnClickListener()
        {
            findViewById<TextView>(R.id.outputText).text = "Vandita Yadav 12321015 Roll number 13 | KO006"
        }

    }
}
