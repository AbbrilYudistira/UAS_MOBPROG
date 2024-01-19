package com.example.abbrilyudistira_32602100008

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btnRecycleview: Button
    private lateinit var btnFragment: Button
    private lateinit var btnNavigasi: Button
    private lateinit var btnRetrofit: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.btn_explisit)

        btn1.setOnClickListener {
            val intentexplisit = Intent( this@MainActivity, MainActivity2::class.java)
            startActivity(intentexplisit)
        }

        btn2 = findViewById(R.id.btn_implisit)
        btn2.setOnClickListener {
            val url = "https://webstatic.hoyoverse.com/upload/op-public/2022/10/19/f78c1e6d0d9be6f01a4e2c76e97c61ff_2965043907182953261.png"
            val intentImplisit = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intentImplisit)
        }

        btnRecycleview = findViewById(R.id.btn_recycleview)

        btnRecycleview.setOnClickListener {
            val recycleView = Intent(this@MainActivity, RecycleActivity::class.java)
            startActivity(recycleView)
        }

        btnFragment = findViewById(R.id.btn_fragment)

        btnFragment.setOnClickListener {
            val toFragment = Intent(this@MainActivity, FragmentActivity::class.java)
            startActivity(toFragment)
        }

        btnNavigasi = findViewById(R.id.btn_navigasi)

        btnNavigasi.setOnClickListener {
            val toNavigasi = Intent(this@MainActivity, BottomNavigasiActivity::class.java)
            startActivity(toNavigasi)
        }

        btnRetrofit = findViewById(R.id.btn_retrofit)

        btnRetrofit.setOnClickListener {
            val toRetrofit = Intent(this@MainActivity, RetrofitActivity::class.java)
            startActivity(toRetrofit)
        }
    }
}