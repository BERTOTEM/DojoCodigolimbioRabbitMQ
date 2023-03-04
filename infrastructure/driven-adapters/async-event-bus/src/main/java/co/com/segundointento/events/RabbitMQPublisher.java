package co.com.segundointento.events;

import co.com.segundointento.model.persona.Persona;
import co.com.segundointento.usecase.crear.gateways.EventPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class RabbitMQPublisher implements EventPublisher {
    public static final String EXCHANGE = "core-posts-events";

    public static final String ROUTING_KEY = "events.routing.key";

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQPublisher.class);

    private RabbitTemplate rabbitTemplate;

    public RabbitMQPublisher(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendJsonMessage(Persona person){

    }

    @Override
    public void publish(Persona persona) {
        LOGGER.info(String.format("Message sent -> %s", persona.toString()));
        rabbitTemplate.convertAndSend(EXCHANGE,ROUTING_KEY,persona);
    }
}
