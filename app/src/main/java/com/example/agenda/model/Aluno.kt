package com.example.agenda.model

import androidx.annotation.NonNull

class Aluno(
    val nome:  String,
    val telefone: String,
    val email: String){
    @NonNull
    @Override
    override open fun toString():String{
        return this.toString()
    }
}
