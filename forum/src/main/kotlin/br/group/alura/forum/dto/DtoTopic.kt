package br.group.alura.forum.dto

data class DtoTopic(
    val title: String,
    val message: String,
    val idLesson: Long,
    val idAuthor: Long
)
