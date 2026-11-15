package com.daniel.sms_manager_api.business.dto;

import com.daniel.sms_manager_api.infrastructure.enums.SmsStatus;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SmsMessageRequestDTO {

    private String remetente;
    private String numeroDestinatario;
    private String mensagem;
    private SmsStatus statusEnvio;

}
