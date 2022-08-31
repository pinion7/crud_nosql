package beyond.crud_nosql

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.config.EnableMongoAuditing
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@SpringBootApplication
@EnableMongoAuditing
@EnableMongoRepositories()
class CrudNosqlApplication

fun main(args: Array<String>) {
	runApplication<CrudNosqlApplication>(*args)
}
