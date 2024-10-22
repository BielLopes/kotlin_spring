package br.com.galoma.demo.repository

import br.com.galoma.demo.model.Topico
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TopicoRepository: JpaRepository<Topico, Long>{
}