package com.study.elasticsearch.user.service

import com.study.elasticsearch.user.document.UserDocument
import com.study.elasticsearch.user.repository.UserDocumentRepository
import org.springframework.stereotype.Service
import kotlin.jvm.optionals.getOrNull

@Service
class UserService(
    private val repository: UserDocumentRepository,
) {
    fun create(
        id: String,
        name: String,
        age: Long,
        isActive: Boolean,
    ): UserDocument {
        val user = UserDocument(
            id = id,
            name = name,
            age = age,
            isActive = isActive,
        )
        return repository.save(user)
    }

    fun getAll(): List<UserDocument> = repository.findAll().toList()

    fun getById(
        id: String,
    ): UserDocument = repository.findById(id).getOrNull()
        ?: throw NoSuchElementException("User with id $id not found")

    fun update(
        id: String,
        name: String,
        age: Long,
        isActive: Boolean,
    ): UserDocument {
        val user = getById(id)
        user.update(
            name = name,
            age = age,
            isActive = isActive,
        )
        return repository.save(user)
    }

    fun deleteById(
        id: String,
    ) {
        val user = getById(id)
        repository.delete(user)
    }
}
