package co.com.segundointento.model.persona.gateways;

import co.com.segundointento.model.persona.Persona;
import reactor.core.publisher.Mono;

public interface PersonaRepository {
    Mono<Persona> createPerson(Persona persona);

}
