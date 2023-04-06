package com.rabbitmq.example.rabbitmq.consumer;


import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Bean
    public Queue myQueue() {
        return new Queue("test", true);
    }

    @RabbitListener(queues = "test")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);

        rabbitTemplate.convertAndSend("my_exchange", "my_routing_key", message);
    }
    //    @RabbitListener(queues = "test")
//    public void receiveMessage(String message) {
//        System.out.println("Received message: " + message);
//    }
}


