package br.group.alura.forum.controller

import br.group.alura.forum.dto.DtoTopicForm
import br.group.alura.forum.dto.DtoTopicView
import br.group.alura.forum.model.Topic
import br.group.alura.forum.service.TopicService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/topics")
class TopicController(private val service: TopicService) {

    @GetMapping
    fun listing(): List<DtoTopicView> {
        return service.listing()
    }

    @GetMapping("/{id}")
    fun searchById(@PathVariable id: Long): DtoTopicView {
        return service.searchById(id)
    }

    @PostMapping
    fun register(@RequestBody dto: DtoTopicForm) {
        service.register(dto)
    }

}