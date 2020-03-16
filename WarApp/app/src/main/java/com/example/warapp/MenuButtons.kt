package com.example.warapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MenuButtons : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?) : View? {
        val view = inflater.inflate(R.layout.menu_buttons,container,false)

        val gunbutton: Button = view.findViewById(R.id.Guns_id)
        gunbutton.setOnClickListener{
            val fragmenttranscation: FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmenttranscation.replace(R.id.container,GunType())
            fragmenttranscation.addToBackStack(null)
            fragmenttranscation.commit()
        }

        val bulletbutton: Button = view.findViewById(R.id.Horses_id)
        bulletbutton.setOnClickListener{
            val fragmenttranscation: FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmenttranscation.replace(R.id.container,HorsesList())
            fragmenttranscation.addToBackStack(null)
            fragmenttranscation.commit()
        }
        return view}
}



