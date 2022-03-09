package br.group.alura.forum.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class DtoTopicForm(
    @field:NotEmpty
    @field:Size(min = 5, max = 50)
    val title: String,
    @field: NotEmpty
    val message: String,
    @field: NotNull
    val idLesson: Long,
    @field: NotEmpty
    val idAuthor: Long
)
