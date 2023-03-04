package co.com.segundointento.usecase.crear.gateways;

import co.com.segundointento.model.persona.Persona;

public interface EventPublisher {
    void publish(Persona persona);
}
