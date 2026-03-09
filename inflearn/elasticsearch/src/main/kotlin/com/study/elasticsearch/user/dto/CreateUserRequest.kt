package com.study.elasticsearch.user.dto

data class CreateUserRequest(
    val id: String,
    val name: String,
    val age: Long,
    val isActive: Boolean,
)
