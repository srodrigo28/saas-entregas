package com.delivery.api.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RegraPrecoRequestDTO {

    private BigDecimal taxaBase;
    private BigDecimal valorPorKm;
    private String tipoVeiculo;
}
