package com.example.config

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

 class MainActivity : AppCompatActivity() {
    private var TAG = "com.example.configuration_changes.MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyStateChangeActivity", "onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.d("MyStateChangeActivity", "onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyStateChangeActivity", "onDestroy")
    }
    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.d(TAG, "onConfigurationChanged")
        // [ ... Update any UI based on resource values ... ]
        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Log.d(TAG, "Orientation Landscape")
        } else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Log.d(TAG, "Orientation Landscape")
        }
        if (newConfig.keyboardHidden == Configuration.KEYBOARDHIDDEN_NO) {
            Log.d(TAG, "Keyboard Hidden No")
        }
    }

}
