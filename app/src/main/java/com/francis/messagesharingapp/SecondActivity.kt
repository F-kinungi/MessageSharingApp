package com.francis.messagesharingapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        // use the bundle to extract the incoming value
        val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString("keys")
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()

        tvUserMessage.text = msg
    }
}
//Bundles are generally used for passing data between different android activities
//not-null assertion operator(!!). use ot when you user the value is not null