package com.example.warapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction


class GunType: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.gun_types,container,false)

        val m642button: Button = view.findViewById(R.id.MK20_gun)
        m642button.setOnClickListener{
            val fragmenttranscation: FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmenttranscation.replace(R.id.container,MK20_gun())
            fragmenttranscation.addToBackStack(null)
            fragmenttranscation.commit()
        }

        val mk14button: Button = view.findViewById(R.id.MK20_SSR_gun)
        mk14button.setOnClickListener{
            val fragmenttranscation: FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmenttranscation.replace(R.id.container,MK20_SSR_gun())
            fragmenttranscation.addToBackStack(null)
            fragmenttranscation.commit()
        }

        val bm4button: Button = view.findViewById(R.id.SCAR_H_gun)
        bm4button.setOnClickListener{
            val fragmenttranscation: FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmenttranscation.replace(R.id.container,SCAR_H_gun())
            fragmenttranscation.addToBackStack(null)
            fragmenttranscation.commit()
        }
        return view
    }
}
