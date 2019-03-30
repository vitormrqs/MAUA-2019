package com.first.vmarq.aula5

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
        listView.adapter = adapter //Trocar ID do listView para listView
        //Configura o ID do botão;
        button.setOnClickListener{
            if(editText.text.isEmpty()){
                editText.error = "Por favor, preencha algo"
            } else {
                val dado = editText.text.toString()
                adapter.add(dado)
                editText.text.clear()
            }
        }

        //Configura evento de toque do listView;
        listView.setOnItemClickListener { parent, view, position, id ->
            val item = adapter.getItem(position)
            Toast.makeText(applicationContext, "Olá ${item}", Toast.LENGTH_SHORT).show()
            true
        }
        //Configura o evento de long click;
        listView.setOnItemLongClickListener { parent, view, position, id ->
            val item = adapter.getItem(position)
            adapter.remove(item)
            true
        }
    }
}
