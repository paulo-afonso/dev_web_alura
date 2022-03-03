package br.group.alura.forum.service

import br.group.alura.forum.dto.DtoTopic
import br.group.alura.forum.model.Topic
import org.springframework.stereotype.Service

@Service
class TopicService(
    private var topics: List<Topic> = ArrayList(),
    private val lessonService: LessonService,
    private val userService: UserService
    ) {


    fun listing(): List<Topic> {
        return topics
    }

    fun searchById(id: Long): Topic {
        return topics.stream().filter { t ->
            t.id == id
        }.findFirst().get()
    }

    fun register(dto: DtoTopic) {
        topics = topics.plus(Topic(
            id = topics.size.toLong() + 1,
            title = dto.title,
            message = dto.message,
            lessons = lessonService.searchById(dto.idLesson),
            author = userService.searchById(dto.idAuthor),
        ))
    }

}