package com.delivery.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB_REGRA_PRECO")
public class RegraPreco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private BigDecimal taxaBase;
    private BigDecimal valorPorKm;

    @Enumerated(EnumType.STRING)
    private TipoVeiculo tipoVeiculo;
}
