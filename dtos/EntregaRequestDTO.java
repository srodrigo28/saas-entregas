package com.delivery.api.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class EntregaRequestDTO {

    private UUID estabelecimentoId;
    private EnderecoDTO enderecoColeta;
    private EnderecoDTO enderecoEntrega;
}
