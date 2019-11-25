package com.example.myactionbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        lblInfo.text = MainActivity.counter.toString()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.mymenu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val x =item?.title

        MainActivity.counter+=1
        when(x){
            "previous"->{startActivity(Intent(this, SecondActivity::class.java))
            }
            "next"->{startActivity(Intent(this, MainActivity::class.java))}
        }
        return super.onOptionsItemSelected(item)
    }
}
