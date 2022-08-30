package beyond.crud_nosql.domain

import beyond.crud_nosql.domain.base.BaseDocumentEntity
import org.bson.types.ObjectId
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.data.mongodb.core.mapping.MongoId

@Document
class Post(title: String, content: String, user: User) : BaseDocumentEntity() {

    @MongoId
    val id: ObjectId? = null

    @Field
    var title: String = title
        protected set

    @Field
    var content: String = content
        protected set

    @DBRef
    var user: User = user
        protected set

//    fun updatePostFields(params: UpdatePostRequestDto) {
//        val (title, content) = params
//        if (title != null) this.title = title
//        if (content != null) this.content = content
//    }
}