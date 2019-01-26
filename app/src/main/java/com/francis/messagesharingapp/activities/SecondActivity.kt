package com.francis.messagesharingapp.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.francis.messagesharingapp.Extensions.showToast
import com.francis.messagesharingapp.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val bundle: Bundle? = intent.extras
        bundle?.let {
            val msg = bundle.getString("keys")
            showToast(msg)
            tvUserMessage.text = msg
        }
    }
}
// use the bundle to extract the incoming value
//Bundles are generally used for passing data between different android activities
//not-null assertion operator(!!). use ot when you user the value is not null