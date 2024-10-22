package br.com.galoma.demo.model

import javax.persistence.*

@Entity
data class Usuario (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val nome: String,

    val email: String
)