package br.com.virandoprogramador.service

import br.com.virandoprogramador.model.Usuario
import br.com.virandoprogramador.repository.UsuarioRepository
import org.springframework.stereotype.Service

@Service
class UsuarioService(private val repository: UsuarioRepository) {

    fun buscarPorId(id: Long): Usuario {
        return repository.getOne(id)
    }
}