package com.example.meuprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuprojeto.databinding.ActivityPessoa5Binding

class PessoaActivity5 : AppCompatActivity() {
    private lateinit var binding: ActivityPessoa5Binding
    private var nome = ""
    private var idade = 0
    private val listaPessoas = mutableListOf<Pessoa>()
    private  var listaAtual = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPessoa5Binding.inflate(layoutInflater)
        binding.butImpmir.setOnClickListener {
            binding.txtSaida.text = cadatraPessoa()
        }

        binding.butSalvar.setOnClickListener {
            nome = binding.txtNome.text.toString()
            binding.txtNome.text.clear()
            idade = binding.txtIdade.text.toString().toInt()
            binding.txtIdade.text.clear()
            val pessoa = Pessoa(nome, idade)
            listaPessoas.add(pessoa)

        }



        setContentView(binding.root)
    }

    fun cadatraPessoa(): String {
     if (listaAtual>=listaPessoas.size)
         listaAtual=0

      val pessoaAtual = listaPessoas[listaAtual]
       listaAtual++
        return " Nome:${pessoaAtual.nome} ${pessoaAtual.idade}"

    }


}