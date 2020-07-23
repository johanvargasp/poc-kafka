package com.todopago.pockafka.producer.controller;

import com.todopago.pockafka.producer.dto.GeneralResponseDto;
import com.todopago.pockafka.producer.dto.MessageRequestDto;
import com.todopago.pockafka.producer.service.ProducerService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Log4j2
@RestController
@RequestMapping(value = "/kafka")
public class ProducerController {
    
    @Autowired
    private ProducerService producerService;
    
    @PostMapping(value = "/publish")
    public ResponseEntity<Object> sendMessageToKafkaTopic(@RequestBody MessageRequestDto messageRequestDto) {
        try {
            this.producerService.sendMessage(messageRequestDto.getMessage());
            return ResponseEntity.ok(GeneralResponseDto.builder()
                    .message("Message published")
                    .build());
        } catch (Exception e) {
            log.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
