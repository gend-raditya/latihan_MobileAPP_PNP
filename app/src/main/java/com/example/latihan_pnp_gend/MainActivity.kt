package com.example.latihan_pnp_gend

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnMi : Button
    private lateinit var btnTekom : Button
    private lateinit var btnPoto : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        btnMi = findViewById(R.id.btnMi)
        btnTekom = findViewById(R.id.btnTekom)
        btnPoto = findViewById(R.id.btnPoto)

        btnMi.setOnClickListener(){
            val intent = Intent(this, ManajemenInformatika::class.java)
            startActivity(intent)
        }
        btnTekom.setOnClickListener(){
            val intent = Intent(this, Tekom::class.java)
            startActivity(intent)
        }
        btnPoto.setOnClickListener(){
            val intent = Intent(this, Galery::class.java)
            startActivity(intent)
        }


    }
}