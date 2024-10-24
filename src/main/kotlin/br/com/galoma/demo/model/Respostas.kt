package br.com.galoma.demo.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Respostas (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,

    val mensagem: String,

    val dataCriacao: LocalDateTime = LocalDateTime.now(),

    @ManyToOne
    val autor: Usuario,

    @ManyToOne
    val topico: Topico,

    val solucao: Boolean
)