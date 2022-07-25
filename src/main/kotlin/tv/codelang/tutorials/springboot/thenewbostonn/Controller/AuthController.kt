package tv.codelang.tutorials.springboot.thenewbostonn.Controller;

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController;
import tv.codelang.tutorials.springboot.thenewbostonn.Domain.User
import tv.codelang.tutorials.springboot.thenewbostonn.Domain.UserFactory
import tv.codelang.tutorials.springboot.thenewbostonn.Dtos.UserRegisterDto
import tv.codelang.tutorials.springboot.thenewbostonn.Services.UserService

@RestController
@RequestMapping("api")
class AuthController(
    private val userService: UserService,
    private val userFactory: UserFactory
 ) {

    @PostMapping("user")
    fun register(@RequestBody body: UserRegisterDto): ResponseEntity<User> {
        val user = this.userService.save(this.userFactory.createUser(body))

        return ResponseEntity.ok(user)
    }
}
