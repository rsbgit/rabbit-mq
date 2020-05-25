package com.rabbitmq.producer.controller;

import com.rabbitmq.producer.model.Employee;
import com.rabbitmq.producer.service.RabbitMQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbit")
public class ProducerController {
    @Autowired
    private RabbitMQService rabbitMQService;

    @PostMapping
    public void sendMessage(@RequestBody Employee employee) {
        rabbitMQService.send(employee);
    }

}
