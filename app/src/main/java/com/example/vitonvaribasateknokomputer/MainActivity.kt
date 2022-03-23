package com.example.vitonvaribasateknokomputer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.vitonvaribasateknokomputer.adapter.ItemAdapter
import com.example.vitonvaribasateknokomputer.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // seting layout recyclerView
        setContentView(R.layout.activity_recyclerview)

        // ambil data dari class Datasource
        val myDataset = Datasource().loadAffirmations()

        // menyiapkan recyclerview
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        // menyiapkan/memanggil adapter class
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }
}