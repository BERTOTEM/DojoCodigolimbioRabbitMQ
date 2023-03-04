package co.com.segundointento.events;

import co.com.segundointento.model.persona.Persona;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class RabbitMqEventHandler {
    public static final String EVENTS_QUEUE = "events.queue";

    private final Logger LOGGER = Logger.getLogger("RabbitMqEventHandler");

    @RabbitListener(queues = EVENTS_QUEUE)
    public  void consume(Persona persona){
        LOGGER.info(String.format("Received message -> %s",persona.toString()));
    }
}
