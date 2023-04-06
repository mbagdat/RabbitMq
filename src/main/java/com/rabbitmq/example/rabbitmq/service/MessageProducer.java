//package com.rabbitmq.example.rabbitmq.service;
//
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class MessageProducer {
//
//        @Autowired
//        private RabbitTemplate rabbitTemplate;
//
//        public void sendMessage(String message) {
//            rabbitTemplate.convertAndSend("my_exchange", "my_routing_key", message);
//            System.out.println("Sent message: " + message);
//        }
//    }
//