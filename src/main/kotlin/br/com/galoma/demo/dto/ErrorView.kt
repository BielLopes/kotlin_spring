package br.com.galoma.demo.dto

import java.time.LocalDateTime

data class ErrorView (

    val timestamp: LocalDateTime = LocalDateTime.now(),
    val status: Int,
    val erro: String,
    val message: String?,
    val path: String

)