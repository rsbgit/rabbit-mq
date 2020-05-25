package com.rabbitmq.producer.service;

import com.rabbitmq.producer.model.Employee;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQService {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${ravi.rabbitmq.exchange}")
    private String exchange;

    @Value("${ravi.rabbitmq.routingkey}")
    private String routingkey;

    public void send(Employee employee) {
        rabbitTemplate.convertAndSend(exchange, routingkey, employee);
        System.out.println("Sending msg = " + employee);

    }
}