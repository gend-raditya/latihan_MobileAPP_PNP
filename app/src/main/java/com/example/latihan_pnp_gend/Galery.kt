package com.example.latihan_pnp_gend

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.latihan_pnp_gend.adapter.GalleryAdapter

class Galery : AppCompatActivity() {

    private val imageList = arrayOf(
        R.drawable.pnp1,
        R.drawable.pnp,
        R.drawable.pnp2,
        R.drawable.pnp3,
        R.drawable.pnp4,
        R.drawable.pnp5,
        R.drawable.pnp6,
        R.drawable.pnp7

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galery)

        // Set up the GridView for photos
        val gridView = findViewById<GridView>(R.id.gridView)
        val adapter = GalleryAdapter(this, imageList)
        gridView.adapter = adapter

        // Set up onClickListener for grid items
        gridView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, PhotoDetail::class.java)
            intent.putExtra("imageResId", imageList[position]) // Pass the selected image ID to detail activity
            startActivity(intent)
        }
    }
}
