package com.example.myactionbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{
        var counter=1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lblInfo.text = counter.toString()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.mymenu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val x =item?.title
        counter+=1

        when(x){
            "previous"->{startActivity(Intent(this, ThirdActivity::class.java))

            }
            "next"->{startActivity(Intent(this, SecondActivity::class.java))}
        }
        return super.onOptionsItemSelected(item)
    }
}
