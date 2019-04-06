package com.idelbrando.projetobaseatividadet1_2019_eca804

// Gustavo Oliani David 14.02750-0
// Vitor Marques 14.02147-0
// Pablo Silva 09.01688-0

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Cria um adapter;
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)
        //Liga o adapter ao ListView;
        listView.adapter = adapter //Trocar ID do listView para listView;
        //Configura o ID do botão;
        btnAdd.setOnClickListener{
            //Se algum dos edits estiverem vazio, pedir novamente;
            if(editTextNomeProduto.text.isEmpty() || editTextQuantProd.text.isEmpty()){
                editTextNomeProduto.error = "Por favor, preencha algo que está faltando."
            } else {
                //Armazena o produto e a quantidade do editText em variáveis;
                val produto = editTextNomeProduto.text.toString()
                val quantidade = editTextQuantProd.text.toString()
                //Transfere as variavies concatenadas para a lista;
                adapter.add(produto+": "+quantidade)
                //Limpar caixas de texto
                editTextNomeProduto.text.clear()
                editTextQuantProd.text.clear()
            }
        }

        //Configura o evento de long click;
        listView.setOnItemLongClickListener { parent, view, position, id ->
            val item = adapter.getItem(position)
            adapter.remove(item)
            true
        }


    }
}
