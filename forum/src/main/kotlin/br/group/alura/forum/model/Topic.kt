package br.group.alura.forum.model

import java.time.LocalDateTime

data class Topic (
    var id: Long? = null,
    val title: String,
    val message: String,
    val date: LocalDateTime = LocalDateTime.now(),
    val lessons: Lesson,
    val author: User,
    val status: TopicStatus = TopicStatus.NO_REPLY,
    val responses: List<Answer> = ArrayList()


)