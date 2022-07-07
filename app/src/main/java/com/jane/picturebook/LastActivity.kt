package com.jane.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class LastActivity : AppCompatActivity() {
    lateinit var imgserve:ImageButton
    lateinit var tvServing:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last)
        Serve()
    }
    fun Serve(){
        imgserve=findViewById(R.id.imgserve)
        tvServing=findViewById(R.id.tvServing)

        imgserve.setOnClickListener {
            val intent= Intent(this,ThankyouActivity::class.java)
            startActivity(intent)
        }
    }
}