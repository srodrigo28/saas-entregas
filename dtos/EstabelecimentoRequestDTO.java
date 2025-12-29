package com.delivery.api.dto;

import lombok.Data;

@Data
public class EstabelecimentoRequestDTO {

    private String nome;
    private String cnpj;
    private Double latitude;
    private Double longitude;
}
