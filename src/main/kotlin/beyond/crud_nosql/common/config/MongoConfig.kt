package beyond.crud_nosql.common.config

import org.springframework.boot.autoconfigure.mongo.MongoProperties
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.MongoTransactionManager
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory


@Configuration
class MongoConfig {
    @Bean
    @ConfigurationProperties("spring.data.mongodb")
    fun properties(): MongoProperties {
        return MongoProperties()
    }

    @Bean
    fun mongoDatabaseFactory(properties: MongoProperties): SimpleMongoClientDatabaseFactory {
        return SimpleMongoClientDatabaseFactory(properties.uri)
    }

    @Bean
    fun mongoTemplate(): MongoTemplate {
        return MongoTemplate(mongoDatabaseFactory(MongoProperties()))
    }

    @Bean
    fun transactionManager(databaseFactory: SimpleMongoClientDatabaseFactory): MongoTransactionManager {
        return MongoTransactionManager(databaseFactory)
    }

}