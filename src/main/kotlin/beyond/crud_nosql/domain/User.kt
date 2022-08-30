package beyond.crud_nosql.domain

import beyond.crud_nosql.domain.base.BaseDocumentEntity
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.data.mongodb.core.mapping.MongoId
import java.util.*

@Document
class User(email: String, password: String, nickname: String): BaseDocumentEntity() {

    @Id
    var id: ObjectId? = ObjectId.get()

    @Field
    @Indexed(unique = true)
    var email: String = email
        protected set;

    @Field
    var password: String = password
        protected set;

    @Field
    var nickname: String = nickname
        protected set;

    @Field
    var quit: Boolean = false

//    var posts: MutableList<Post> = mutableListOf()
//        protected set;

    fun updateNickname(nickname: String) {
        this.nickname = nickname
    }

    fun withdraw() {
        this.quit = true
    }

//    override fun toString(): String {
//        return "User(id=$id, email='$email', password='$password', nickname='$nickname', posts=$posts)"
//    }
}