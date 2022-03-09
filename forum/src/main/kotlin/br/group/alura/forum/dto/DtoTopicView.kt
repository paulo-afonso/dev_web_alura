package br.group.alura.forum.dto

import br.group.alura.forum.model.TopicStatus
import java.time.LocalDateTime

data class DtoTopicView (
    val id: Long?,
    val title: String,
    val message: String,
    val status: TopicStatus,
    val createDate: LocalDateTime
)