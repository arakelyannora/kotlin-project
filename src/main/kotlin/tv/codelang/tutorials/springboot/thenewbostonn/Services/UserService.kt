package tv.codelang.tutorials.springboot.thenewbostonn.Services

import org.springframework.stereotype.Service
import tv.codelang.tutorials.springboot.thenewbostonn.Domain.User
import tv.codelang.tutorials.springboot.thenewbostonn.Repositories.UserRepository

@Service
class UserService(private val userRepository: UserRepository) {
    fun save(user: User): User {
        return this.userRepository.save(user)
    }
}