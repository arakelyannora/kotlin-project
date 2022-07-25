package tv.codelang.tutorials.springboot.thenewbostonn.Dtos

import org.jetbrains.annotations.NotNull

class UserRegisterDto(
    @NotNull
    val name: String,
    @NotNull
    val email: String,
    @NotNull
    val password: String
)