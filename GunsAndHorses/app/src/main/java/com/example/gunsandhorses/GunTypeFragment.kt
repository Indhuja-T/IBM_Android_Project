package com.example.gunsandhorses
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.gunsandhorses.R
import com.example.gunsandhorses.data.Gun



class GunTypeFragment : Fragment() {
    var position = 0
    var tvTitle: TextView? = null
    var tvDetails: TextView? = null
    override fun onCreate( savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) { // Get back arguments
            if (getArguments() != null)
            {position = getArguments()!!.getInt("position", 0)}
        }
    }

    override fun onCreateView(inflater: LayoutInflater, parent: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.gun_detail, parent, false)
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        tvTitle = view.findViewById<View>(R.id.tvTitle) as TextView
        tvDetails = view.findViewById<View>(R.id.tvDetails) as TextView
        tvTitle!!.setText(Gun.gunMenu.get(position))
        tvDetails!!.setText(Gun.gunDetails.get(position))
    }


    fun updateView(position: Int) {
        tvTitle?.setText(Gun.gunMenu.get(position))
        tvDetails?.setText(Gun.gunDetails.get(position))
    } }