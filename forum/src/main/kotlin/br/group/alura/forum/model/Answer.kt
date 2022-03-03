package br.group.alura.forum.model

import java.time.LocalDateTime

data class Answer (
    val id: Long?,
    val message: String,
    val dateCreation: LocalDateTime = LocalDateTime.now(),
    val author: User,
    val topic: Topic,
    val solution: Boolean


)

