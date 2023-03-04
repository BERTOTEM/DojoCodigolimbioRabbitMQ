package co.com.segundointento.usecase.crear;

import co.com.segundointento.model.persona.Persona;
import co.com.segundointento.model.persona.gateways.PersonaRepository;
import co.com.segundointento.usecase.crear.gateways.EventPublisher;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class CrearUseCase {
    private final  PersonaRepository personaRepository;
    private final EventPublisher eventPublisher;

    public Mono<Persona>createPerson(Persona persona)
    {
        return personaRepository.createPerson(persona)
                .map(persona1 -> {eventPublisher.publish(persona1);
        return  persona1;
        });
    }

}
