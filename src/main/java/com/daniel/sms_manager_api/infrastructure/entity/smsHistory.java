package com.daniel.sms_manager_api.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "historico")
public class smsHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "smsMensagem")
    private String smsMensagem;
    @Column(name = "statusMessagem")
    private String statusMensagem;
    @Column(name = "descricao")
    private String descricao;
}
