package com.example.practical2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var txt: TextView
    private lateinit var img: ImageView
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt = findViewById(R.id.txt)
        img = findViewById(R.id.img)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)

        txt.setOnClickListener{
            val n = (1..3000).random()
            txt.text = getString(R.string.hello, n)
        }

        btn1.setOnClickListener {
            img.setImageResource(R.drawable.lisa1)
            Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show()
        }

        btn2.setOnClickListener {
            img.setImageResource(R.drawable.lisa2)
            Snackbar.make(btn2, R.string.snackbar, Snackbar.LENGTH_SHORT).show()
        }

        btn3.setOnClickListener { finish()}
    }
}