package com.first.vmarq.aula_3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_resultado.*
import java.util.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        if(Random().nextInt(10)%2==0){
            imagemResultado.text = "CARA"
            imagemResultado.setImageResource(R.drawable.cara)
        } else {
            imagemResultado.text = "COROA"
            imagemResultado.setImageResource(R.drawable.coroa)
        }
    }

    fun Voltar(view: View){
        finish()
    }
}
