package com.example.agenda.dao

import com.example.agenda.model.Aluno

class AlunoDAO {
    val alunos: MutableList<Aluno> = ArrayList()
    fun salva(aluno: Aluno) {
        alunos.add(aluno)
    }

}
