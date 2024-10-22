package br.com.galoma.demo.dto

import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.Size

data class AtualizacaoTopicoForm (


    @field:NotNull(message = "ID deve ser Informado!")
    val id: Long,

    @field:NotEmpty(message = "Mensagem deve ser Informado!")
    @field:Size(min = 5, max = 100, message = "Mensagem deve conter entre 5 e 100 Caracteres!")
    val mensagem: String,

    @field:NotEmpty(message = "Titulo deve ser Informado!")
    @field:Size(min = 5, max = 100, message = "Titulo deve conter entre 5 e 100 Caracteres!")
    val titulo: String,

)