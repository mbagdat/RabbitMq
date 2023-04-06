package com.rabbitmq.example.rabbitmq.repository;


import com.rabbitmq.example.rabbitmq.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}
