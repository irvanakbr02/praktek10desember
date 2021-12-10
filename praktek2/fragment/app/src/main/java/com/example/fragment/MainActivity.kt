package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmenSatu = FragmentSatu()
        val fragment  = supportFragmentManager.findFragmentByTag(FragmentSatu::class.java.simpleName)

        if (fragment is FragmentSatu){
            supportFragmentManager.beginTransaction()
                .add(R.id.container, fragmenSatu, FragmentSatu::class.java.simpleName)
                .commit()
        }

    }
}