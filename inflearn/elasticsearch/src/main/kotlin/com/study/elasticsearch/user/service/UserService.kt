package com.study.elasticsearch.user.service

import com.study.elasticsearch.user.document.UserDocument
import com.study.elasticsearch.user.repository.UserDocumentRepository
import org.springframework.stereotype.Service

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
}
