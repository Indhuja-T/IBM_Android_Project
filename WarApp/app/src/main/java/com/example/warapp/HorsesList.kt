package com.example.warapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class HorsesList: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val returnView = inflater.inflate(R.layout.horses_type,container,false)
        val chetakButton: Button = returnView.findViewById(R.id.horse1)
        chetakButton.setOnClickListener{
            val fragmenttranscation: FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmenttranscation.replace(R.id.container,BelgianHorse())
            fragmenttranscation.addToBackStack(null)
            fragmenttranscation.commit()
        }

        val palomoButton: Button = returnView.findViewById(R.id.horse2)
        palomoButton.setOnClickListener{
            val fragmenttranscation: FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmenttranscation.replace(R.id.container,MedievalHorse())
            fragmenttranscation.addToBackStack(null)
            fragmenttranscation.commit()
        }

        val sergeantRecklessButton: Button = returnView.findViewById(R.id.horse3)
        sergeantRecklessButton.setOnClickListener{
            val fragmenttranscation: FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmenttranscation.replace(R.id.container,MarwariHorse())
            fragmenttranscation.addToBackStack(null)
            fragmenttranscation.commit()
        }
        return returnView
    }
}