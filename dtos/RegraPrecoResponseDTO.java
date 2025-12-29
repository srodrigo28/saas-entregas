package com.delivery.api.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class RegraPrecoResponseDTO {

    private UUID id;
    private String tipoVeiculo;
    private String descricao;
}
