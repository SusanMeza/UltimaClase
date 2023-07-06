package com.example.globalstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.globalstore.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nombre = intent.getStringExtra("nombre")
        binding.txtHello.text = "Bienvenido "+nombre;
        binding.fabAddProduct.setOnClickListener{
            val intent = Intent(this, AddProductActivity::class.java)
            startActivity(intent)
        }
    }
}