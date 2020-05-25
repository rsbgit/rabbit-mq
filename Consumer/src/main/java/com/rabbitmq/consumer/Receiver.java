package com.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @RabbitListener(queues = "raviqueue")
    public void receiveMessage(String message) {
        System.out.println("Received \n" + message );

    }
}
