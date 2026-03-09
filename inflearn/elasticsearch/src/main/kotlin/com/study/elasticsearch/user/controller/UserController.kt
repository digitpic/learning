package com.study.elasticsearch.user.controller

import com.study.elasticsearch.user.document.UserDocument
import com.study.elasticsearch.user.dto.CreateUserRequest
import com.study.elasticsearch.user.service.UserService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/users")
class UserController(
    private val service: UserService,
) {
    @PostMapping
    fun create(@RequestBody request: CreateUserRequest): UserDocument = service.create(
        id = request.id,
        name = request.name,
        age = request.age,
        isActive = request.isActive,
    )
}
