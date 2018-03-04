package com.example.vicky.popupmenuandwindow

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.PopupWindow
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_popup.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_show_popup.setOnClickListener {
//            val popup = PopupMenu(this,btn_show_popup)
//            popup.inflate(R.menu.test)
//            popup.setOnMenuItemClickListener {
//                Toast.makeText(this, "Item : " + it.title,Toast.LENGTH_SHORT).show()
//                true
//            }
//            popup.show()

            val window = PopupWindow(this)
            val view = layoutInflater.inflate(R.layout.layout_popup,null)
            window.contentView = view
            val imageView = view.findViewById<ImageView>(R.id.imageView)
            imageView.setOnClickListener {
                window.dismiss()
            }
            window.showAsDropDown(btn_show_popup)
        }

    }
}
