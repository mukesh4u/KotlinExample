 package com.android.developer.soulutions.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        recyclerView.addItemDecoration(DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL))
        val users = ArrayList<User>()
        users.add(User("Mukesh Yadav",30,"himky02@gmail.com","955xxxxx59"))
        users.add(User("ABC Limited",30,"abc@gmail.com","880xxxxx53"))
        users.add(User("XYZ LTD",30,"xyz@gmail.com","966xxxxx59"))
        users.add(User("Muesh",30,"mukesh@gmail.com","955xxxxx99"))
        users.add(User("Android",30,"android@gmail.com","955xxxxx89"))
        users.add(User("Developer",30,"developer@gmail.com","955xxxxx49"))

        val adapter = UserAdapter(users)
        recyclerView.adapter = adapter
    }
}
