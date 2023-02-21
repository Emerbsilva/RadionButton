package com.ebsindustrial.radionbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ebsindustrial.radionbutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.grupo1.setOnCheckedChangeListener{_,id ->
            when(id){
                R.id.opcao1 -> {
                    Log.i("INFOTESTE", "Opção 1")
                }
                R.id.opcao2 ->{
                    Log.i("INFOTESTE", "Opção 2")
                }
                R.id.opcao3 ->{
                    Log.i("INFOTESTE", "Opção 3")
                }
            }
        }
    }
}