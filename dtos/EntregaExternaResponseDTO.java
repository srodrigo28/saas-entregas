package com.delivery.api.dto;

import lombok.Data;

@Data
public class EntregaExternaResponseDTO {

    private String integracao;
    private String externalId;
    private String statusExterno;
}
