package com.delivery.api.controller;

import com.delivery.api.dto.EstabelecimentoRequestDTO;
import com.delivery.api.dto.EstabelecimentoResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/estabelecimentos")
public class EstabelecimentoController {

    @PostMapping
    public ResponseEntity<EstabelecimentoResponseDTO> criar(
            @RequestBody EstabelecimentoRequestDTO dto) {
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<EstabelecimentoResponseDTO>> listar() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstabelecimentoResponseDTO> buscarPorId(
            @PathVariable UUID id) {
        return ResponseEntity.ok().build();
    }
}
