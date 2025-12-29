package com.delivery.api.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class VeiculoResponseDTO {

    private UUID id;
    private String tipo;
    private String placa;
}
