package com.example.meuprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuprojeto.databinding.ActivityLista2Binding

class listaActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityLista2Binding
    private val listaFrutas = listOf("laranja", "macã", "uva")
    private val listaVegetais = listOf("pepino", "tomate", "beteraba")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLista2Binding.inflate(layoutInflater)

        binding.txtBut.setOnClickListener {

            binding.textSaida.text = analizar(binding.txtEntrada.text.toString())
        }

        setContentView(binding.root)

    }

    fun analizar(entrada: String): String {
        var saida = ""
        for (fruta in listaFrutas) {
            fruta == entrada
            saida = "fruta"
            break
        }
return "$saida"
    }


}







