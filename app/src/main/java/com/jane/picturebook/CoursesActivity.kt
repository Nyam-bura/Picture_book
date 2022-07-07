package com.jane.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class CoursesActivity : AppCompatActivity() {
    lateinit var imgcourses:ImageButton
    lateinit var tvcourses:TextView
    lateinit var tvFront:TextView
    lateinit var tvBack:TextView
    lateinit var tvOthers:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)
        courses()

    }
    fun courses(){
        imgcourses=findViewById(R.id.imgcourses)
        tvcourses=findViewById(R.id.tvcourses)
        tvFront=findViewById(R.id.tvFront)
        tvBack=findViewById(R.id.tvBack)
        tvOthers=findViewById(R.id.tvOthers)

        imgcourses.setOnClickListener {
            val intent=Intent(this,LastActivity::class.java)
            startActivity(intent)
        }

    }
}