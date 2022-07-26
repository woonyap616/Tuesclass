package com.example.tuesclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun setListeners(){
        val boxOneTV = findViewById<TextView>(R.id.boxone)

        val clickablesViews: List<View> =
            listOf(
                boxOneTV
            )

        for(item in clickablesViews){
            item.setOnClickListener{}
        }
    }

}