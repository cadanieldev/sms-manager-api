package com.daniel.sms_manager_api.business;


import com.daniel.sms_manager_api.business.dto.SmsMessageRequestDTO;
import com.daniel.sms_manager_api.infrastructure.entity.SmsMessage;
import com.daniel.sms_manager_api.infrastructure.enums.SmsStatus;
import com.daniel.sms_manager_api.infrastructure.repository.SmsMessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class SmsMessageService {

    private final SmsMessageRepository repository;

        public SmsMessage salvarMensagem(SmsMessageRequestDTO dto){
            //Criação da entidade
            SmsMessage sms = new SmsMessage();
            //Transferência de dados dto para entidade
            sms.setRemetente(dto.getRemetente());
            sms.setNumeroDestinatario(dto.getNumeroDestinatario());
            sms.setMensagem(dto.getMensagem());

            //Setando o status
            sms.setStatus(SmsStatus.ENVIADO);

            //Registrando a data de criação
            sms.setDataCriada(LocalDateTime.now());

            //Salvar no banco de dados
            return repository.save(sms);
        }

}
