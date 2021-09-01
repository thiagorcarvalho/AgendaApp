package com.example.agenda.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.agenda.R
import com.example.agenda.dao.AlunoDAO
import com.example.agenda.model.Aluno

class FormularioAlunoActivity2 : AppCompatActivity() {
    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dao = AlunoDAO()
        val campoNome: EditText = findViewById(R.id.activity_formulario_aluno_nome)
        val campoTelefone: EditText = findViewById(R.id.activity_formulario_aluno_telefone)
        val campoEmail: EditText = findViewById(R.id.activity_formulario_aluno_email)
        setContentView(R.layout.activity_formulario_aluno2)
        val botaoSalvar: Button = findViewById(R.id.activity_formulario_aluno_botao_salvar)
        botaoSalvar.setOnClickListener(object : View.OnClickListener{
            @Override
            override fun onClick(v: View?) {
                val nome = campoNome.text.toString()
                val telefone = campoTelefone.text.toString()
                val email = campoEmail.text.toString()

                val alunoCriado = Aluno(nome, telefone, email)
                dao.salva(alunoCriado)
            }
        })
    }
}