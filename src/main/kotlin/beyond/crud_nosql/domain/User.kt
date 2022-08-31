package beyond.crud_nosql.domain

import beyond.crud_nosql.domain.base.BaseDocumentEntity
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.data.mongodb.core.mapping.MongoId

@Document
data class User(
    @Field
    @Indexed(unique = true)
    val email: String,

    @Field
    val password: String,

    @Field
    val nickname: String,

    @Field
    val quit: Boolean = false,

    @MongoId
    val id: ObjectId = ObjectId.get(),
) : BaseDocumentEntity() {

//    var posts: MutableList<Post> = mutableListOf()
//        protected set;

//    fun updateNickname(nickname: String) {
//        this.nickname = nickname
//    }
//
//    fun withdraw() {
//        this.quit = true
//    }

//    override fun toString(): String {
//        return "User(id=$id, email='$email', password='$password', nickname='$nickname', posts=$posts)"
//    }


}