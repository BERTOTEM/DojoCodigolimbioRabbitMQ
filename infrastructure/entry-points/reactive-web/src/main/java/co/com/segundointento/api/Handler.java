package co.com.segundointento.api;

import co.com.segundointento.model.persona.Persona;
import co.com.segundointento.model.persona.gateways.PersonaRepository;
import co.com.segundointento.usecase.crear.CrearUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {

  private final CrearUseCase crearUseCase;

  static Mono<ServerResponse> notFound = ServerResponse.notFound().build();
  //private  final UseCase2 useCase2;
    public Mono<ServerResponse> listenGETUseCase(ServerRequest serverRequest) {
        // usecase.logic();
        return ServerResponse.ok().bodyValue("");
    }

    public Mono<ServerResponse> listenGETOtherUseCase(ServerRequest serverRequest) {
        return ServerResponse.ok().bodyValue("");
    }

    public Mono<ServerResponse> CreatePersona(ServerRequest serverRequest) {
        Mono<Persona> personaMono = serverRequest.bodyToMono(Persona.class) ;

        return personaMono.flatMap(persona -> ServerResponse.
                status(HttpStatus.CREATED).contentType(MediaType.APPLICATION_JSON)
                .body(crearUseCase.createPerson(persona), Persona.class));
    }
}
