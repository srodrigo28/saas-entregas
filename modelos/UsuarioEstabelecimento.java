package com.delivery.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "TB_USUARIO_ESTABELECIMENTO")
public class UsuarioEstabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    private Estabelecimento estabelecimento;

    private String nome;
    private String email;

    @Enumerated(EnumType.STRING)
    private Perfil perfil;
}
