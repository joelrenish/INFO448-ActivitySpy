package edu.uw.ischool.jorenish.activityspy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("ActivityLifecycle", "onCreate event fired - instance state: $savedInstanceState")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ActivityLifecycle", "onDestroy event fired")
        Log.e("ActivityLifecycle", "We're going down, Captain!")
    }

    override fun onStart() {
        super.onStart()
        Log.i("ActivityLifecycle", "onStart event fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ActivityLifecycle", "onStop event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ActivityLifecycle", "onPause event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ActivityLifecycle", "onResume event fired")
    }

}