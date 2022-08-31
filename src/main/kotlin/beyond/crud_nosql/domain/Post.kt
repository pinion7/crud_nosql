package beyond.crud_nosql.domain

import beyond.crud_nosql.domain.base.BaseDocumentEntity
import org.bson.types.ObjectId
import org.springframework.data.annotation.Version
import org.springframework.data.domain.Persistable
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.data.mongodb.core.mapping.MongoId
import java.util.Objects

@Document
data class Post(
    @Field
    val title: String,

    @Field
    val content: String,

    @DBRef
    val user: User,

    @MongoId
    val id: ObjectId? = ObjectId.get()
) : BaseDocumentEntity() {
//    fun updatePostFields(params: UpdatePostRequestDto) {
//        val (title, content) = params
//        if (title != null) this.title = title
//        if (content != null) this.content = content
//    }
}