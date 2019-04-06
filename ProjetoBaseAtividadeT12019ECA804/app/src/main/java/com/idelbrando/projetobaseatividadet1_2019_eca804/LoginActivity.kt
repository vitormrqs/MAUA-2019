package com.idelbrando.projetobaseatividadet1_2019_eca804

// Gustavo Oliani David 14.02750-0
// Vitor Marques 14.02147-0
// Pablo Silva 09.01688-0

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity() {
    val usuario = "user"
    val senha = "pass"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }

        fun mudarDeTela(view: View){
            if((editTextUsuario.text.toString() == usuario) && (editTextSenha.text.toString() == senha)){
                Toast.makeText(applicationContext, "Logado com sucesso!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else{
                Toast.makeText(applicationContext, "Usuário ou senha incorretos, tente novamente!", Toast.LENGTH_SHORT).show()
            }
    }

}

