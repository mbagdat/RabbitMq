package com.rabbitmq.example.rabbitmq.service;


import com.rabbitmq.example.rabbitmq.model.Message;
import com.rabbitmq.example.rabbitmq.repository.MessageRepository;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {


    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private MessageRepository messageRepository;

    public void sendMessage(String message) {
        rabbitTemplate.convertAndSend("my_exchange", "my_routing_key", message);
        saveMessage(message);
    }

    private void saveMessage(String message) {
        Message newMessage = new Message();
        newMessage.setMessage(message);
        messageRepository.save(newMessage);
    }

}

