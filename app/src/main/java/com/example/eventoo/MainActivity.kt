package com.example.eventoo

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var layout: LinearLayout
    private lateinit var boton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        layout = findViewById(R.id.layout)
        boton = findViewById(R.id.boton)

        boton.setOnClickListener {
            layout.setBackgroundColor(Color.parseColor("#FFEB3B"))
        }
    }
}

