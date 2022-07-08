package com.manish.kotlin_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mydatabinding.baseClass.BaseActivity
import com.manish.kotlin_practice.views.HomeFragment

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pushFragment(this, HomeFragment(), false)

    }

}