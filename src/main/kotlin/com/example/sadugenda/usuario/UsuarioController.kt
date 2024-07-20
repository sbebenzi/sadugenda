package com.example.sadugenda.usuario

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/usuario")
class UsuarioController {

    @Autowired
     private lateinit var usuarioService : UsuarioService

    @GetMapping("{idUsuario}")
    fun getUsuarioById(@PathVariable idUsuario:Int):ResponseEntity<Usuario>{
        return ResponseEntity.ok(usuarioService.getUsuarioById(idUsuario))
    }

    @PostMapping("/insere-usuario")
    fun insereUsuario(@RequestBody usuario: CadastroUsuario){
        usuarioService.insereUsuario(usuario)
    }
}