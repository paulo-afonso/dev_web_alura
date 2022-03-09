package br.group.alura.forum.mapper

import br.group.alura.forum.dto.DtoTopicForm
import br.group.alura.forum.model.Topic
import br.group.alura.forum.service.LessonService
import br.group.alura.forum.service.UserService
import org.springframework.stereotype.Component


@Component
class TopicFormMapper(
    private val lessonService: LessonService,
    private val userService: UserService
): Mapper<DtoTopicForm, Topic> {
    override fun map(t: DtoTopicForm): Topic {
        return Topic(
            title = t.title,
            message = t.message,
            lessons = lessonService.searchById(t.idLesson),
            author = userService.searchById(t.idAuthor)
        )
    }
}