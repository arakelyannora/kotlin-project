package tv.codelang.tutorials.springboot.thenewbostonn.Repositories

import org.springframework.data.jpa.repository.JpaRepository
import tv.codelang.tutorials.springboot.thenewbostonn.Domain.User

interface UserRepository: JpaRepository<User, Int> {
}