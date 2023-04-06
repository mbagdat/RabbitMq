package com.rabbitmq.example.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;

public class RabbitMqConfig {

    @Bean
    public DirectExchange myExchange() {
        return new DirectExchange("my_exchange");
    }

    @Bean
    public Binding binding(Queue myQueue, DirectExchange myExchange) {
        return BindingBuilder.bind(myQueue).to(myExchange).with("my_routing_key");
    }

    @Bean
    public Queue myQueue() {
        return new Queue("my_queue", false, false, true);
    }


}
