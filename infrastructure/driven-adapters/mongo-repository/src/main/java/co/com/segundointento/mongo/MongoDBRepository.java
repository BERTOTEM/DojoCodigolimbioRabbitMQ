package co.com.segundointento.mongo;

import co.com.segundointento.mongo.document.PersonaDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;

public interface MongoDBRepository extends ReactiveMongoRepository<PersonaDocument, String>, ReactiveQueryByExampleExecutor<PersonaDocument> {
}
