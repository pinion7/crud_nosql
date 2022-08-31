package beyond.crud_nosql.domain.base

import org.bson.types.ObjectId
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.annotation.Version
import org.springframework.data.domain.Persistable
import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDateTime

abstract class BaseDocumentEntity {
    @Field(name = "created_date")
    @CreatedDate
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    var createdDate: LocalDateTime? = LocalDateTime.now()
        protected set

    @Field(name = "last_modified_date")
    @LastModifiedDate
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    var lastModifiedDate: LocalDateTime? = LocalDateTime.now()
        protected set
}

