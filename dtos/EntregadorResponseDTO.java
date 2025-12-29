package com.delivery.api.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class EntregadorResponseDTO {

    private UUID id;
    private String nome;
    private String telefone;
    private Boolean disponivel;
    private Double latitude;
    private Double longitude;
    private String status;
}
