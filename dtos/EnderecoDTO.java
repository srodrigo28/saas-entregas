package com.delivery.api.dto;

import lombok.Data;

@Data
public class EnderecoDTO {

    private String logradouro;
    private String numero;
    private String cidade;
    private String estado;
    private Double latitude;
    private Double longitude;
}
