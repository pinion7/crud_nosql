package beyond.crud_nosql.repository

import beyond.crud_nosql.domain.User
import org.bson.types.ObjectId
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.Rollback
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
@Transactional
class UserRepositoryTest @Autowired constructor(
    private val userRepository: UserRepository
) {

    @Test
    fun testMongo() {
        // given
        val user = User("abc@naver.com", "1234", "실험쥐1")
        userRepository.save(user)

        // when

        // then
    }


}