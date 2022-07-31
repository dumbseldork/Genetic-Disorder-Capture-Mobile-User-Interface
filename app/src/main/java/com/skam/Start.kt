package com.skam

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_start.*


class Start : AppCompatActivity() {

    private var mBtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        mBtn = findViewById<View>(R.id.btnCamera) as Button
        mBtn!!.setOnClickListener { openCamera() }
    }
    fun openCamera() {
        val intent = Intent(this, Camera::class.java);
        startActivity(intent)
    }
}
