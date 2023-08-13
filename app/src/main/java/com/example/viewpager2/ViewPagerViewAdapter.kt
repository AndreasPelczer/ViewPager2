package com.example.viewpager2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewPagerViewAdapter : RecyclerView.Adapter<ViewPagerViewAdapter.ViewHolder>() {

    var userList: ArrayList<User> = ArrayList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {

        return userList.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nametv.text = userList[position].name
        holder.firstnametv.text = userList[position].firstname
    }
    //neue User anzeigen...
    fun setNewUsers(userList: List<User>)
    {
        this.userList = userList as ArrayList<User>
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nametv: TextView = itemView.findViewById(R.id.tvnametv)
        var firstnametv: TextView = itemView.findViewById(R.id.tvfirstnametv)

    }
}