package com.daniel.sms_manager_api.controller;


import com.daniel.sms_manager_api.business.SmsMessageService;
import com.daniel.sms_manager_api.business.dto.SmsMessageRequestDTO;
import com.daniel.sms_manager_api.infrastructure.entity.SmsMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mensagem")
@RequiredArgsConstructor
public class SmsMessageController {

    private final SmsMessageService service;

    @PostMapping
    public ResponseEntity<SmsMessage> salvar(@RequestBody SmsMessageRequestDTO dto){
        return ResponseEntity.ok(service.salvarMensagem(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SmsMessage> consultar(@PathVariable Long id){
        return ResponseEntity.ok(service.consultarMensagem(id));
    }

}
