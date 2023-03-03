package com.example.guia4

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toolbar
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val btnWhite: Button
        get()=findViewById(R.id.btn_white)
    private val btnRed: Button
        get()=findViewById(R.id.btn_red)
    private val layoutPrincipal: ConstraintLayout
        get()=findViewById(R.id.layoutPrincipal)
    private val toolBar: androidx.appcompat.widget.Toolbar
        get()=findViewById(R.id.toolbar)
    private val btnSnackbar: Button
        get() = findViewById(R.id.btnSnackbar)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar.let {
            setSupportActionBar(toolBar)
        }
        btnRed.setOnClickListener {
            layoutPrincipal.setBackgroundColor(Color.RED)
        }
        btnWhite.setOnClickListener {
            layoutPrincipal.setBackgroundColor(Color.WHITE)
        }
        btnSnackbar.setOnClickListener {
            val mySnackbar=Snackbar.make(findViewById(R.id.layoutPrincipal),R.string.app_name,
                Snackbar.LENGTH_LONG)
            mySnackbar.setAction(R.string.undo_string, MyUndoListener())
            mySnackbar.show()
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