package com.jane.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class IntroductionActivity : AppCompatActivity() {
    lateinit var imgIntro:ImageView
    lateinit var tvself:TextView
    lateinit var btnnext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introduction)
        clicks()
        btnnext.setOnClickListener {
            val intent=Intent(this,CoursesActivity::class.java)
            startActivity(intent)
        }
    }
    fun clicks(){
        imgIntro=findViewById(R.id.imgIntro)
        tvself=findViewById(R.id.tvSelf)
        btnnext=findViewById(R.id.btnnext)
    }
}