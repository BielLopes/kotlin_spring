package br.com.galoma.demo.repository

import br.com.galoma.demo.model
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CursoRepository: JpaRepository<Curso, Long> {

}