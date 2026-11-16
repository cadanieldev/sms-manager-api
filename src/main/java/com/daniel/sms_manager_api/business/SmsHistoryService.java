package com.daniel.sms_manager_api.business;


import com.daniel.sms_manager_api.business.dto.SmsHistoryRequestDTO;
import com.daniel.sms_manager_api.infrastructure.entity.SmsHistory;
import com.daniel.sms_manager_api.infrastructure.entity.SmsMessage;
import com.daniel.sms_manager_api.infrastructure.repository.SmsHistoryRepository;
import com.daniel.sms_manager_api.infrastructure.repository.SmsMessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SmsHistoryService {

    private final SmsHistoryRepository smsHistoryRepository;
    private final SmsMessageRepository smsMessageRepository;

    public SmsHistory salvarHistorico(SmsHistoryRequestDTO dto){
        SmsMessage sms = smsMessageRepository.findById(dto.getSmsMessageId()).orElseThrow(() ->
                new RuntimeException("Mensagem não encontrada."));

        //Criar a entidade/historico
        SmsHistory history = new SmsHistory();

        //Preenche o historico com dados
        history.setStatusMensagem(dto.getStatusMensagem());
        history.setDescricao(dto.getDescricao());

        //Relacionando-se com a entidade SmsMessage
        history.setSmsMessage(sms);

        //Salvar no repository
        return smsHistoryRepository.save(history);
    }



}
