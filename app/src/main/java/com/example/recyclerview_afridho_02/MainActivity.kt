package com.example.recyclerview_afridho_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vtuberslist = listOf<VTubers>(
            VTubers(
                R.drawable.amelia,
                "Amelia Watson",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum"
            ),
            VTubers(
                R.drawable.risu,
                "Ayunda Risu",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum"
            ),
            VTubers(
                R.drawable.mumei,
                "Nanashi Mumei",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum"
            ),
            VTubers(
                R.drawable.okayu,
                "Nekomata Okayu",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_vtubers)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = VTubersAdapter(this, vtuberslist){

        }
    }
}