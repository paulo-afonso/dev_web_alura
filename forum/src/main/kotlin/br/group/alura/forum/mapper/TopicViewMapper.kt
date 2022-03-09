package br.group.alura.forum.mapper

import br.group.alura.forum.dto.DtoTopicView
import br.group.alura.forum.model.Topic
import org.springframework.stereotype.Component

@Component
class TopicViewMapper: Mapper<Topic, DtoTopicView> {

    override fun map(t: Topic): DtoTopicView {
        return DtoTopicView(
            id = t.id,
            title = t.title,
            message = t.message,
            createDate = t.date,
            status = t.status
        )
    }
}