package com.francis.messagesharingapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_hobbies.*

class HobbiesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)
/**LayoutManager can be  initialized in the xml file and therefore reduce amount of code used*/
//       val layoutManager = LinearLayoutManager(this)
//        layoutManager.orientation = LinearLayoutManager.VERTICAL
//        //attach layoutmanager with recyclerview
//        recyclerView.layoutManager = layoutManager

        val hobbyAdapter = HobbyAdapter(this, Suppliers.hobbies)
        recyclerView.adapter = hobbyAdapter
    }
}

// Layout managers are used to position the views inside RecyclerView
//They also determine when to reuse item views that are no longer visible to the user
