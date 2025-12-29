package com.delivery.api.controller;

import com.delivery.api.dto.UsuarioEstabelecimentoRequestDTO;
import com.delivery.api.dto.UsuarioEstabelecimentoResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/usuarios-estabelecimento")
public class UsuarioEstabelecimentoController {

    @PostMapping
    public ResponseEntity<UsuarioEstabelecimentoResponseDTO> criar(
            @RequestBody UsuarioEstabelecimentoRequestDTO dto) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/estabelecimento/{estabelecimentoId}")
    public ResponseEntity<List<UsuarioEstabelecimentoResponseDTO>> listarPorEstabelecimento(
            @PathVariable UUID estabelecimentoId) {
        return ResponseEntity.ok().build();
    }
}
