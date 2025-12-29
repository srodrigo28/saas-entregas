package com.delivery.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "TB_ESTABELECIMENTO")
public class Estabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String nome;
    private String cnpj;

    private Double latitude;
    private Double longitude;

    @Enumerated(EnumType.STRING)
    private Status status;
}
