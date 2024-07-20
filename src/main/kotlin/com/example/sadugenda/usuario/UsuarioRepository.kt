package com.example.sadugenda.usuario

import org.springframework.stereotype.Repository

@Repository
class UsuarioRepository {

    fun getUsuarioById(idUsuario: Int): Usuario {
        val sql = """
            select a.id_usuario,a.email,a.nome_usuario,a.data_criacao from tb_usuario a
            where a.id_usuario =:id_usuario 
        """.trimIndent()
        val mapa = HashMap<String,Any>()
        mapa["id_usuario"] = idUsuario

        return Usuario(

        )
    }

    fun insereRepository(usuario: CadastroUsuario) {
        val sql = """
            insert into tb_usuario(a.id_usuario,a.email,a.nome_usuario,a.senha)
            values (nextVal('seq_id_usuario'),:email,:nome_usuario,:senha)
        """.trimIndent()
        val mapa = HashMap<String,Any>()
        mapa["email"]
        mapa["nome_usuario"]
        mapa["senha"]

    }

}