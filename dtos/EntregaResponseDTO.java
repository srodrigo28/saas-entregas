package com.delivery.api.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class EntregaResponseDTO {

    private UUID id;
    private UUID entregadorId;
    private Double distanciaKm;
    private BigDecimal valor;
    private String status;
    private String tipo;
}
