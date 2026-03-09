package com.study.elasticsearch.user.document

import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document
import org.springframework.data.elasticsearch.annotations.Field
import org.springframework.data.elasticsearch.annotations.FieldType

@Document(indexName = "users")
class UserDocument(
    @Id
    val id: String? = null,

    @Field(type = FieldType.Text)
    var name: String,

    @Field(type = FieldType.Long)
    var age: Long,

    @Field(type = FieldType.Boolean)
    var isActive: Boolean,
) {
    fun update(
        name: String,
        age: Long,
        isActive: Boolean,
    ) {
        this.name = name
        this.age = age
        this.isActive = isActive
    }
}
