package co.com.segundointento.mongo;

import co.com.segundointento.model.persona.Persona;
import co.com.segundointento.model.persona.gateways.PersonaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
@Component
@AllArgsConstructor
public class PersonaRepositoryImpl  implements PersonaRepository {
    private  MongoRepositoryAdapter dao;

    @Override
    public Mono<Persona> createPerson(Persona persona) {
        return dao.save(persona);
    }
}
