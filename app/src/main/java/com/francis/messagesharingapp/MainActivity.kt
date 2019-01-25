package com.francis.messagesharingapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            // code to be executed once the button is clicked
            Log.i("MainActivity", "Button was clicked")
            Toast.makeText(this, "Button was clicked", Toast.LENGTH_LONG).show()
        }
        btnSendDataToActivity.setOnClickListener {
            val message:String = editText.text.toString()
            //Toast.makeText(this, message, Toast.LENGTH_LONG).show()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("keys", message) // use put extra to pass message
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
