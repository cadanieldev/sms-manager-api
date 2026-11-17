package com.daniel.sms_manager_api.controller;


import com.daniel.sms_manager_api.business.SmsMessageService;
import com.daniel.sms_manager_api.business.dto.SmsMessageRequestDTO;
import com.daniel.sms_manager_api.infrastructure.entity.SmsMessage;
import com.daniel.sms_manager_api.infrastructure.enums.SmsStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<SmsMessage>> listar(){
        return ResponseEntity.ok(service.listarMensagens());
    }

    @PutMapping("/{id}")
    public ResponseEntity<SmsMessage> updateMensagem(@PathVariable Long id,
                                                     @RequestBody SmsMessageRequestDTO dto){
        return ResponseEntity.ok(service.alterarMensagem(dto, id));
    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<SmsMessage> alterar(@PathVariable Long id,
                                              @RequestBody SmsStatus status){
        return ResponseEntity.ok(service.alterarStatus(status, id));
    }
}
