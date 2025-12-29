package com.delivery.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB_HISTORICO_STATUS")
public class HistoricoStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    private Entrega entrega;

    @Enumerated(EnumType.STRING)
    private StatusEntrega status;

    private LocalDateTime dataHora;
}
