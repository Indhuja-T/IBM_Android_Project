package com.example.views

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity


class ClearableEditText(context: Context?) :
    LinearLayout(context) {
    var editText: EditText
    var clearButton: Button
    /**
     * Listing 4-14: Implementing the Clear Text Button
     */
    private fun hookupButton() {
        clearButton.setOnClickListener { editText.setText("") }
    }

    init {

        val infService = Context.LAYOUT_INFLATER_SERVICE
        val li: LayoutInflater
        li = getContext().getSystemService(infService) as LayoutInflater
        li.inflate(R.layout.clearable_edit_text, this, true)
        editText = findViewById<View>(R.id.editText) as EditText
        clearButton = findViewById<View>(R.id.clearButton) as Button
        hookupButton()
    }
}