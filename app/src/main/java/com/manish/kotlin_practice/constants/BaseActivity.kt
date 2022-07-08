package com.example.mydatabinding.baseClass

import android.content.Context
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.manish.kotlin_practice.MainActivity
import com.manish.kotlin_practice.R

open class BaseActivity  : AppCompatActivity() {

    val TAG : String = BaseActivity::class.java.simpleName

    fun pushFragment(context: Context, fragment: Fragment, isAdd: Boolean){
        Log.d(TAG, "pushFragment: FragmentName-->"+fragment::class.java.simpleName)

        if (isAdd)
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container_view, fragment)
                .addToBackStack(fragment::class.java.simpleName)
                .commit()
        else
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container_view, fragment)
                .commit()
    }



}