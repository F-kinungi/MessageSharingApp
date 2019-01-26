package com.francis.messagesharingapp.adapters

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.francis.messagesharingapp.Extensions.showToast
import com.francis.messagesharingapp.models.Hobby
import com.francis.messagesharingapp.R
import kotlinx.android.synthetic.main.list_items.view.*

// context refers to the hobbiesActivity layout
class HobbyAdapter(val context: Context, private val hobbies: List<Hobby> ):RecyclerView.Adapter<HobbyAdapter.MyViewHolder>(){

    //onCreateViewHolder will inflate views to the list_items layout.
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
    //itemView represent each item(view) in the List
    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        var currentHobby: Hobby? = null
        var currentPostion:Int  = 0
        //setOnclickLister to the ItemViews
        init {
            itemView.setOnClickListener {
                context.showToast(currentHobby!!.title + " Clicked ")
            }
            itemView.imgShare.setOnClickListener {
               val message = "My hobby is: "+ currentHobby!!.title
                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT, message)
                intent.type = "text/type"
                context.startActivity(Intent.createChooser(intent, " please select app "))
            }
        }
        fun setData(hobby: Hobby?, pos:Int) {
            itemView.txvTitle.text = hobby!!.title

            this.currentHobby = hobby
            this.currentPostion =pos

        }

    }

}

//onCreateViewHolder is responsible for creating each of the ViewHolder item