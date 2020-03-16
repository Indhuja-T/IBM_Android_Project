package com.example.gunsandhorses


import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.example.gunsandhorses.data.Gun

class GunFragment : Fragment() {
    var itemsAdapter: ArrayAdapter<String>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        itemsAdapter = getContext()?.let {
            ArrayAdapter<String>(
                it,
                android.R.layout.simple_list_item_1,
                Gun.gunMenu
            )
        }
    }

    override fun onCreateView(inflater: LayoutInflater,parent: ViewGroup?,  savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.gun_menu, parent, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val lvItems =
            view.findViewById<View>(R.id.lvItems) as ListView
        lvItems.adapter = itemsAdapter
        lvItems.onItemClickListener =
            object:OnItemClickListener {
                override fun onItemClick(parent:AdapterView<*>?, view:View, position:Int, id:Long){
                    if(listener!==null){
                listener?.onGunSelected(position)}
                    else {
                        listener?.onGunSelected(position)
                    }
            }
    }

    }

    private var listener: OnItemSelectedListener? = null
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnItemSelectedListener) {
            listener = context
        } else {
            throw ClassCastException(
                context.toString()
                        + " must implement Fragment.OnItemSelectedListener"
            )
        }
    }


    interface OnItemSelectedListener {
        fun onGunSelected(position: Int)
    }
}
