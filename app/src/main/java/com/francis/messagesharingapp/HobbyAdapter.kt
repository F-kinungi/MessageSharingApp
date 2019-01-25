package com.francis.messagesharingapp

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_items.view.*

// context refers to the hobbiesActivity layout
class HobbyAdapter(val context: Context, private val hobbies: List<Hobby> ):RecyclerView.Adapter<HobbyAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
      val view = LayoutInflater.from(context).inflate(R.layout.list_items, parent, false)
        return MyViewHolder(view)

    }

    override fun getItemCount(): Int {
        return hobbies.size
    }
// bind the ListViews to  TextViews
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    val hobby = hobbies[position]
    holder.setData(hobby, position)

    }

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun setData(hobby: Hobby?, pos:Int) {
            itemView.txvTitle.text = hobby!!.title

        }

    }

}

//onCreateViewHolder is responsible for creating each of the ViewHolder item