package com.study.elasticsearch.user.dto

data class UpdateUserRequest(
    val name: String,
    val age: Long,
    val isActive: Boolean,
)
