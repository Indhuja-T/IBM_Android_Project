package com.example.gunsandhorses

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction


class MainActivity : AppCompatActivity(),GunFragment.OnItemSelectedListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    if (savedInstanceState == null)
    {        val firstFragment = GunFragment()
        val ft: FragmentTransaction = supportFragmentManager.beginTransaction()
        ft.add(R.id.flContainer, firstFragment)
        ft.commit()
}
        if (resources.configuration.orientation === Configuration.ORIENTATION_LANDSCAPE) {
            val secondFragment = GunTypeFragment()
            val args = Bundle()
            args.putInt("position", 0)
            secondFragment.setArguments(args)
            val ft2 =
                supportFragmentManager.beginTransaction()
            ft2.add(R.id.flContainer2, secondFragment)
            ft2.commit()
        }    }
    override fun onGunSelected(position: Int) {
        val secondFragment = GunTypeFragment()
        val args = Bundle()
        args.putInt("position", position)
        secondFragment.arguments = args
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.flContainer, secondFragment)
            .addToBackStack(null)
            .commit()
        if (resources.configuration.orientation === Configuration.ORIENTATION_LANDSCAPE) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flContainer2, secondFragment)
                .commit()
        } else {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flContainer, secondFragment)
                .addToBackStack(null)
                .commit()
        }}





}



