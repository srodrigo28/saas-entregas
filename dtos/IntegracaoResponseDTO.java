package com.delivery.api.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class IntegracaoResponseDTO {

    private UUID id;
    private String nome;
    private Boolean ativo;
    private Integer prioridade;
}
