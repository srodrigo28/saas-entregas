package com.delivery.api.dto;

import lombok.Data;

@Data
public class IntegracaoRequestDTO {

    private String nome;
    private Boolean ativo;
    private Integer prioridade;
}
