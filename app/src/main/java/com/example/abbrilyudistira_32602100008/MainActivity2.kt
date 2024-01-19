package com.example.abbrilyudistira_32602100008

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class MainActivity2 : AppCompatActivity() {

    private lateinit var btn3: Button
    private lateinit var btn4: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btn3 = findViewById(R.id.btn_moveActivity)

        // Explisit Intent
        btn3.setOnClickListener {
            val moveIntent = Intent(this@MainActivity2, MainActivity::class.java)
            startActivity(moveIntent)
        }

        btn4 = findViewById(R.id.btn_implicitGallery)

        // Implisit Intent ke Gallery
        btn4.setOnClickListener {
            val url = "https://www.youtube.com/watch?v=eZIQMP8w3M4"
            val intentImplisit = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intentImplisit)
        }
    }
}