package com.example.minecraft22402837

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.minecraft22402837.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        val spinner = binding.spinnerMaterial
//
//        val items = listOf("Item 1", "Item 2", "Item 3")  // Itens para o Spinner
//        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, items)
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//
//        spinner.adapter = adapter

        val spinner_material: Spinner = binding.spinnerMaterial
        val materiais = listOf("Madeira", "Ouro", "Diamante")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, materiais)
        spinner_material.adapter = adapter

        val qntConstructors = binding.edtQntConstuctors

        if(materiais == "Madeira"){
            
        }
    }
}