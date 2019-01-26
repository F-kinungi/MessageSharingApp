package com.francis.messagesharingapp.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.francis.messagesharingapp.Constants
import com.francis.messagesharingapp.Extensions.showToast
import com.francis.messagesharingapp.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity: AppCompatActivity() {

    companion object {
        val TAG:String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnShowToast.setOnClickListener {
            // code to be executed once the button is clicked
            Log.i(TAG, "Button was clicked")
            showToast("Button was clicked")
        }
        btnSendDataToActivity.setOnClickListener {
            val message:String = editText.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(Constants.USER_MSG_KEY, message) // use put extra to pass message
            startActivity(intent)
        }
        btnShareToOtherApps.setOnClickListener {
            val message:String = editText.text.toString()

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "share to: "))
        }
        btnRecycleViewDemo.setOnClickListener {

         val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }
    }



}
