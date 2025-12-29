package com.delivery.api.dto;

import lombok.Data;
import java.util.UUID;

@Data
public class EstabelecimentoResponseDTO {

    private UUID id;
    private String nome;
    private String cnpj;
    private Double latitude;
    private Double longitude;
    private String status;
}
