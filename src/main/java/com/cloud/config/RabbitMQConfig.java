package com.cloud.config;

/*import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitMQConfig {

    public static final String QUEUE_NAME_HELLO = "hello";

    @Bean(name = "hello")
    public Queue helloQueue(){
        return new Queue( QUEUE_NAME_HELLO);
    }

    // 创建交换机 TopicExchange
    @Bean
    public TopicExchange exchange(){
        return new TopicExchange("exchange");
    }

    // 根据绑定规则将队列绑定到交换机上
    @Bean
    public Binding bindExchangeMessage(@Qualifier("hello") Queue queue, TopicExchange exchange){
        return BindingBuilder.bind(queue).to(exchange).with(QUEUE_NAME_HELLO);
    }
}*/
