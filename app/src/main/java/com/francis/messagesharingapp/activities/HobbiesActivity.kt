package com.francis.messagesharingapp.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.francis.messagesharingapp.adapters.HobbyAdapter
import com.francis.messagesharingapp.R
import com.francis.messagesharingapp.models.Suppliers
import kotlinx.android.synthetic.main.activity_hobbies.*

class HobbiesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)
        setUpRecyclerView()
    }
    private fun setUpRecyclerView() {
        val hobbyAdapter = HobbyAdapter(this, Suppliers.hobbies)
        // Access the RecyclerView Adapter and load the data into it
        recyclerView.adapter = hobbyAdapter
    }
}

