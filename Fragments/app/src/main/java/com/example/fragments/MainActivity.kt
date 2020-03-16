package com.example.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_two)
        setupViews()
    }

    private fun setupViews() {
        val First=findViewById<Button>(R.id.one_button)
        First.setOnClickListener(View.OnClickListener {
            replaceFragment(
                FragmentOne()
            )
        })
        val Second=findViewById<Button>(R.id.two_button)
        Second.setOnClickListener(View.OnClickListener {
            replaceFragment(
                FragmentTwo()
            )
        })
    }

    fun replaceFragment(fragment: Fragment?) {
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        if (fragment != null) {
            transaction.replace(R.id.right_hand_side_container, fragment)
        }
        transaction.addToBackStack(null)
        transaction.commit()
    }
}

