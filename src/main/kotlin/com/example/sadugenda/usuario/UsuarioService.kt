package com.example.sadugenda.usuario

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UsuarioService {
    @Autowired
    private lateinit var usuarioRepository: UsuarioRepository


    fun getUsuarioById(idUsuario: Int): Usuario {
        return usuarioRepository.getUsuarioById(idUsuario)
    }

    fun insereUsuario(usuario: CadastroUsuario) {
        usuarioRepository.insereRepository(usuario)
    }
}