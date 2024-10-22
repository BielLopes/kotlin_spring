package br.com.galoma.demo.service

import br.com.galoma.demo.model.Usuario
import br.com.galoma.demo.repository.UsuarioRepository
import org.springframework.stereotype.Service

@Service
class UsuarioService(private val repository: UsuarioRepository) {

    fun buscarPorId(id: Long): Usuario {
        return repository.getOne(id)
    }
}