package com.example.guia4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {
    private val toolBar: androidx.appcompat.widget.Toolbar
        get()=findViewById(R.id.toolbar)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar.let {
            setSupportActionBar(toolBar)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){
            R.id.menu_item1->{
                Log.d("TEST","PRESS ICON MENU")
                true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}