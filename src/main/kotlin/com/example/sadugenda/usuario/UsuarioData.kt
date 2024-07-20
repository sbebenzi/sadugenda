package com.example.sadugenda.usuario


data class Usuario(
        val idUsuario:Int,
        val email:String,
        val nomeUsuario:String,
)

data class CadastroUsuario(
        val email:String,
        val nomeUsuario: String,
        val senha:String,
)