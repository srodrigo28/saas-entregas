package com.delivery.api.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class UsuarioEstabelecimentoResponseDTO {

    private UUID id;
    private String nome;
    private String email;
    private String perfil;
}
