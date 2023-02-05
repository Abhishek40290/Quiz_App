package com.abhishek.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart: Button = findViewById(R.id.btn_start)
        val edText: EditText = findViewById(R.id.ed_text)
        btnStart.setOnClickListener {
         if(edText.text.isEmpty()){
             Toast.makeText(this, "please enter your name", Toast.LENGTH_LONG).show()
         }else{
             val a = Intent(this, QuestionActivity::class.java)
             intent.putExtra(Constants.USER_NAME, edText.text.toString())
             startActivity(a)
             finish()
         }

        }
    }
}