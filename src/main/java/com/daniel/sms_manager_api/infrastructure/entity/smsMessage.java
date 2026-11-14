package com.daniel.sms_manager_api.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "mensagem")
public class smsMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "remetente")
    private String remetente;
    @Column(name = "numeroDestinatario")
    private String numeroDestinatario;
    @Column(name = "mensagem")
    private String mensagem;
    @Column(name = "status")
    private String status;
    @Column(name = "dataCriada")
    private LocalDateTime dataCriada;
    @Column(name = "ultimaData")
    private LocalDateTime ultimaData;

}
