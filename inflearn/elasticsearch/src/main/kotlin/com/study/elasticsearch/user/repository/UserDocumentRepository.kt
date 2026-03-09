package com.study.elasticsearch.user.repository

import com.study.elasticsearch.user.document.UserDocument
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository
import org.springframework.stereotype.Repository

@Repository
interface UserDocumentRepository : ElasticsearchRepository<UserDocument, String>
