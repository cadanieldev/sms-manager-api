package com.daniel.sms_manager_api.business.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SmsHistoryRequestDTO {

    private String statusMensagem;
    private String descricao;
    private Long smsMessageId;

}
