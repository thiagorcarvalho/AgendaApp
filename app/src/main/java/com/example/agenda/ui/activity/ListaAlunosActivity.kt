package com.example.agenda.ui.activity

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.agenda.R

public class ListaAlunosActivity: AppCompatActivity() {
    val alunos: List<String> = listOf("thiago","stefani","lucas","teste","teste2")
    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_alunos)
        setTitle("Lista de Alunos")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,alunos)

        val listaDeAlunos: ListView = findViewById(R.id.activity_lista_alunos_listview)

        listaDeAlunos.setAdapter(adapter)
    }
}