package com.example.gunsandhorses

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    if (savedInstanceState == null)
    {        val firstFragment = GunFragment()
        val ft: FragmentTransaction = supportFragmentManager.beginTransaction()
        ft.add(R.id.flContainer, firstFragment)
        ft.commit()
}
    fun onGunSelected(position: Int) {
        Toast.makeText(this, "Called By Fragment A: position - $position", Toast.LENGTH_SHORT).show()
        val secondFragment = GunTypeFragment()
        val args = Bundle()
        args.putInt("position", position)
        secondFragment.setArguments(args)
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.flContainer, secondFragment)
                    .addToBackStack(null)
                    .commit()
        }
    }
}


