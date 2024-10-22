package br.com.galoma.demo.service

import br.com.galoma.demo.model.Curso
import br.com.galoma.demo.repository.CursoRepository
import org.springframework.stereotype.Service

@Service
class CursoService(private val repository: CursoRepository) {

    fun buscarPorId(id: Long): Curso{
        return repository.getOne(id)
    }

}