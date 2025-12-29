package com.delivery.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "TB_ENTREGA_EXTERNA")
public class EntregaExterna {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @OneToOne
    private Entrega entrega;

    @ManyToOne
    private Integracao integracao;

    private String externalId;
    private String statusExterno;
}
