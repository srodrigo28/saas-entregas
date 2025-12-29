package com.delivery.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "TB_ENTREGADOR")
public class Entregador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String nome;
    private String telefone;

    private Boolean disponivel;

    private Double latitude;
    private Double longitude;

    @Enumerated(EnumType.STRING)
    private Status status;
}
