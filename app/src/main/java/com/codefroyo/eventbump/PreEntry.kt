package com.codefroyo.eventbump

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pre_entry.*

class PreEntry : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pre_entry)

        supportActionBar!!.hide()

        to_login_button.setOnClickListener {
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
        }

        to_sign_up_button.setOnClickListener {
            val intent = Intent(this,SignUp::class.java)
            startActivity(intent)
        }


    }
}
