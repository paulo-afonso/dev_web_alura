package br.group.alura.forum.service

import br.group.alura.forum.dto.DtoTopicForm
import br.group.alura.forum.dto.DtoTopicView
import br.group.alura.forum.mapper.TopicFormMapper
import br.group.alura.forum.mapper.TopicViewMapper
import br.group.alura.forum.model.Topic
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class TopicService(
    private var topics: List<Topic> = ArrayList(),
    private var topicViewMapper: TopicViewMapper,
    private var topicFormMapper: TopicFormMapper


    ) {


    fun listing(): List<DtoTopicView> {
        return topics.stream().map { t -> topicViewMapper.map(t) }.collect(Collectors.toList())
    }

    fun searchById(id: Long): DtoTopicView {
        val topic = topics.stream().filter { t ->
            t.id == id
        }.findFirst().get()
        return topicViewMapper.map(topic)
    }

    fun register(form: DtoTopicForm) {
        val topic = topicFormMapper.map(form)
        topic.id = topics.size.toLong() + 1
        topics = topics.plus(topic)
    }

}