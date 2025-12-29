package com.delivery.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB_ENTREGA")
public class Entrega {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    private Estabelecimento estabelecimento;

    @ManyToOne
    private Entregador entregador;

    @ManyToOne
    private Endereco enderecoColeta;

    @ManyToOne
    private Endereco enderecoEntrega;

    private Double distanciaKm;

    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    private StatusEntrega status;

    @Enumerated(EnumType.STRING)
    private TipoEntrega tipo;
}
