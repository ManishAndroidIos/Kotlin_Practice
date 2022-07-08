package com.example.mydatabinding.baseClass

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.manish.kotlin_practice.R

open class BaseFragment: Fragment() {

    val TAG : String = BaseFragment::class.java.simpleName

   fun pushFragment(activity: Activity, fragment: Fragment, isAdd: Boolean){
       Log.d(TAG, "pushFragment: FragmentName-->"+fragment::class.java.simpleName)
       if (isAdd)
           (activity as AppCompatActivity).supportFragmentManager
               .beginTransaction()
               .replace(R.id.fragment_container_view, fragment)
               .addToBackStack(fragment::class.java.simpleName)
               .commit()
       else
           (activity as AppCompatActivity).supportFragmentManager
               .beginTransaction()
               .replace(R.id.fragment_container_view, fragment)
               .commit()
    }

}