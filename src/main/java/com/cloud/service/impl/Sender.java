package com.cloud.service.impl;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 *
 */
@Component
public class Sender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(){
        String context = "hello : " + new Date();
        System.out.println("context : " + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }
}
