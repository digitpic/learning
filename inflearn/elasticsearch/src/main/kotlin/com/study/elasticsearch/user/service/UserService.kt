package com.study.elasticsearch.user.service

import co.elastic.clients.elasticsearch._types.query_dsl.LikeBuilders.document
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
        val document = UserDocument(
            id = id,
            name = name,
            age = age,
            isActive = isActive,
        )
        return repository.save(document)
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
        val document = getById(id)
        document.update(
            name = name,
            age = age,
            isActive = isActive,
        )
        return repository.save(document)
    }
}
