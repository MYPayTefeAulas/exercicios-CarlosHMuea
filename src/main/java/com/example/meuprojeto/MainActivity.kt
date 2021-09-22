package com.example.meuprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.meuprojeto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)


        binding.btTrocar.setOnClickListener {
            // binding.txtHello.text = textoDentrada()
            // binding.txtHello.text = calculaTriplo()
            //  binding.txtHello.text = multiplicar()
            //  binding.txtHello.text = calcula()
            binding.txtHello.text = calculaComWhen()
        }


        setContentView(binding.root)
    }

    fun textoDentrada(): String {
        return binding.txtNumero2.text.toString()
    }


    fun calculaTriplo(): String {
        val numeroStr = binding.txtNumero2.text.toString()
        val nmer = numeroStr.toInt()
        val calculaTriplo = nmer * 3
        return calculaTriplo.toString()
    }

    fun multiplicar(): String {
        val numer1 = binding.txtNumero1.text.toString().toInt()
        val numer2 = binding.txtNumero2.text.toString().toInt()
        val valorR = numer1 * numer2
        return valorR.toString()
    }

    /*fun calcula(): String {
         val operacao = binding.txtOperacao.text.toString()
         val numer1 = binding.txtNumero1.text.toString().toInt()
         val numer2 = binding.txtNumero2.text.toString().toInt()
         var rsltString= ""
         if (operacao == "/") {
             rsltString = (numer1 / numer2).toString()
         } else if (operacao == "-") {

             rsltString = (numer1 - numer2).toString()
         }else{
             rsltString = " operacao invalida"
         }
         return rsltString.toString() }*/

    fun calculaComWhen(): String {

        val operacao = binding.txtOperacao.text.toString()
        val numer1 = binding.txtNumero1.text.toString().toInt()
        val numer2 = binding.txtNumero2.text.toString().toInt()
        var rsltString = ""
        when (operacao) {

            "+" -> rsltString = (numer1 + numer2).toString()
            "-" -> rsltString = (numer1 - numer2).toString()
            "/" -> rsltString = (numer1 / numer2).toString()
            "*" -> rsltString = (numer1 * numer2).toString()
         else-> rsltString = " operacao invalida"
        }
        return rsltString.toString()
        }


    }


