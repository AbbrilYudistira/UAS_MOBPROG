package com.example.abbrilyudistira_32602100008

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecycleActivity : AppCompatActivity() {

    private lateinit var rvData: RecyclerView
    private var listMahasiswa = ArrayList<Mahasiswa>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle)

        rvData = findViewById(R.id.rc_data)
        rvData.setHasFixedSize(true)
        rvData.layoutManager = LinearLayoutManager(this)

        listMahasiswa.add(Mahasiswa("Abbril Yudistira", "32602100008"))
        listMahasiswa.add(Mahasiswa("Seele", "The Hunt"))
        listMahasiswa.add(Mahasiswa("Fu Xuan", "The Preservation"))
        listMahasiswa.add(Mahasiswa("SilverWolf", "The Nihility"))
        listMahasiswa.add(Mahasiswa("Sparkle", "The Harmony"))

        val mahasiswaAdapter = MahasiswaAdapter(listMahasiswa)
        rvData.adapter = mahasiswaAdapter
    }
}