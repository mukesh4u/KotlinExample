package com.android.developer.soulutions.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


/**
 * Created by Mukesh on 10/7/2019.
 * https://www.androiddevelopersolutions.com/
 */
class UserAdapter(val userList : ArrayList<User>) : RecyclerView.Adapter<UserAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return userList.size

    }

    override fun onBindViewHolder(holder: UserAdapter.ViewHolder, position: Int) {
        holder.bindItems(userList[position])
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(user: User) {
            val tvName = itemView.findViewById(R.id.tvName) as TextView
            val tvEmail  = itemView.findViewById(R.id.tvEmail) as TextView
            val tvPhone  = itemView.findViewById(R.id.tvMobile) as TextView
            tvName.text = user.name
            tvEmail.text = user.email
            tvPhone.text = user.phone
        }
    }
}