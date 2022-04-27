package com.example.sorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    private val buttonDraw by lazy { findViewById<Button>(R.id.buttonDraw) }
    private val textViewDrawn by lazy { findViewById<TextView>(R.id.textDrawn) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        draw()
    }

    private fun draw() {
        buttonDraw.setOnClickListener {
            var numRandom = Random().nextInt(11)
            textViewDrawn.text = numRandom.toString()
        }
    }
}