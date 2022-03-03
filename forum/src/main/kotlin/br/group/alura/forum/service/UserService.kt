package br.group.alura.forum.service

import br.group.alura.forum.model.User
import org.springframework.stereotype.Service

@Service
class UserService(var users: List<User>) {

    init {
        val user = User(
            id = 1,
            name = "Paulindo",
            email = "paulindo@gmail.com"
        )
        users = listOf(user)
    }

    fun searchById(id: Long): User {
        return users.stream().filter { c -> c.id == id }.findFirst().get()
    }

}
