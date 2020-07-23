package com.todopago.pockafka.producer.controller;

import com.todopago.pockafka.producer.dto.GeneralResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class HealthController {
    
    @GetMapping(value = "/validate")
    public ResponseEntity<GeneralResponseDto> getHealthStatus() {
        return ResponseEntity.ok(GeneralResponseDto.builder()
                .message("status ok!")
                .build());
    }
}
