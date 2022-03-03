package br.group.alura.forum.service

import br.group.alura.forum.model.Lesson
import org.springframework.stereotype.Service

@Service
class LessonService(var lessons: List<Lesson>) {

    init {
        val lesson = Lesson(
            id = 1,
            name = "Kotlin",
            category = "Web Development"
        )
        lessons = listOf(lesson)
    }

    fun searchById(id: Long): Lesson {
        return lessons.stream().filter { c -> c.id == id }.findFirst().get()
    }

}
