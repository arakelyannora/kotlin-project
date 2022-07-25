package tv.codelang.tutorials.springboot.thenewbostonn.Domain

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service
import tv.codelang.tutorials.springboot.thenewbostonn.Dtos.UserRegisterDto

@Service
class UserFactory() {

    private val encoder = BCryptPasswordEncoder()

    fun createUser(userRegisterDto: UserRegisterDto): User
    {
        return User(userRegisterDto.email, userRegisterDto.name, encoder.encode(userRegisterDto.password))
    }
}