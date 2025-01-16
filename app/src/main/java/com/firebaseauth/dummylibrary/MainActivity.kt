package com.firebaseauth.dummylibrary

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mytoast.shoaib.MainActivity
import com.mytoast.shoaib.MyToasterClass.Companion.myMethod

class MainActivity : AppCompatActivity() {
    lateinit var hello:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)
        hello=findViewById(R.id.hello)
        hello.setOnClickListener {
            startActivity(Intent(this@MainActivity,MainActivity::class.java))
        }
        Toast.makeText(this, "Test Toast", Toast.LENGTH_SHORT).show()
         myMethod(this,"Shoaib Nasr Toast")

     }
}