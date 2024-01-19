package com.example.abbrilyudistira_32602100008

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.abbrilyudistira_32602100008.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        binding = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val fragment1 = Fragment1()

        val fragment = mFragmentManager.findFragmentByTag(Fragment1::class.java.simpleName)
        if (fragment !is Fragment1) {
            mFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, fragment1, Fragment1::class.java.simpleName)
                .commit()
        }
    }
}