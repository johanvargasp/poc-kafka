package com.todopago.pockafka.consumer.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Log4j2
public class Consumer {
    
    @KafkaListener(topics = "users", groupId = "group_id")
    public void consume(String message) {
        log.info(String.format("[Date:%s] Consumed Message -> %s", LocalDateTime.now().toString(), message));
    }
}
