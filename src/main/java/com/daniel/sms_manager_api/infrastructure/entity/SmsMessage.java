package com.daniel.sms_manager_api.infrastructure.entity;

import com.daniel.sms_manager_api.infrastructure.enums.SmsStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "mensagem")
public class SmsMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "remetente")
    private String remetente;
    @Column(name = "numeroDestinatario")
    private String numeroDestinatario;
    @Column(name = "mensagem")
    private String mensagem;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private SmsStatus status;
    @Column(name = "dataCriada")
    private LocalDateTime dataCriada;
    @Column(name = "ultimaData")
    private LocalDateTime ultimaData;
    @OneToMany(mappedBy = "smsMessage")
    @Builder.Default
    private List<SmsHistory> historicos = new ArrayList<>();

}
