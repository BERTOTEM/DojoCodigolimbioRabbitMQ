package co.com.segundointento.mongo;

import co.com.segundointento.model.persona.Persona;
import co.com.segundointento.model.persona.gateways.PersonaRepository;
import co.com.segundointento.mongo.document.PersonaDocument;
import co.com.segundointento.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class MongoRepositoryAdapter extends AdapterOperations<Persona, PersonaDocument, String, MongoDBRepository>

{

    public MongoRepositoryAdapter(MongoDBRepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Persona.class));
    }


}
