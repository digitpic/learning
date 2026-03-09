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
    val name: String,

    @Field(type = FieldType.Long)
    val age: Long,

    @Field(type = FieldType.Boolean)
    val isActive: Boolean,
)
