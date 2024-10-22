package br.com.galoma.demo.dto

import br.com.galoma.demo.model.StatusTopico
import java.time.LocalDateTime

data class TopicoView (
        val id: Long?,
        val titulo: String,
        val mensagem: String,
        val status: StatusTopico,
        val dataCriacao: LocalDateTime
    )