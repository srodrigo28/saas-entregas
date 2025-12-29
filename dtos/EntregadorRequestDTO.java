package com.delivery.api.dto;

import lombok.Data;

@Data
public class EntregadorRequestDTO {

    private String nome;
    private String telefone;
    private Double latitude;
    private Double longitude;
}
