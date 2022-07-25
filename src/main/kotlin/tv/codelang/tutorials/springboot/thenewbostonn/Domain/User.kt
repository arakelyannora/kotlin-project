package tv.codelang.tutorials.springboot.thenewbostonn.Domain

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*

@Entity
class User(
    @Column(unique = true) val email: String,
    @Column val name: String,
    @Column @JsonIgnore val password: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int = 0
}