package com.cloud.service.impl;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
 *
 *
 */
@Component
public class Receiver {


    @RabbitListener(queues = "hello")
    @RabbitHandler
    public void process(String message, Channel channel) throws Exception {
//        throw new Exception("人为异常");
        System.out.println("Receiver1 : " + message);
    }
}
