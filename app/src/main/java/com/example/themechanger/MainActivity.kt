package com.example.themechanger

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRead=findViewById<Button>(R.id.btnRead)
        val buttonDark=findViewById<Button>(R.id.btnDark)
        val layOut=findViewById<LinearLayout>(R.id.linearLayOut)

        buttonRead.setOnClickListener{
//            changing color theme:-
            layOut.setBackgroundResource(R.color.yellow)
        }
        buttonDark.setOnClickListener {
            layOut.setBackgroundResource(R.color.black)
        }
    }
}