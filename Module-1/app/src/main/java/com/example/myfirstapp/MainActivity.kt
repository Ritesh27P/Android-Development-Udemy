package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var value = 0
        val btnClickMe = findViewById<Button>(R.id.mybutton)
        btnClickMe.text = "Increment"

        val textView1 = findViewById<TextView>(R.id.mytextView)
        textView1.text = "0"

        btnClickMe.setOnClickListener{
            value += 1
            textView1.text = value.toString()
            Toast.makeText(this, "You toast", Toast.LENGTH_LONG).show()
        }

    }
}