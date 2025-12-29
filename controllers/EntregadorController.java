package com.delivery.api.controller;

import com.delivery.api.dto.EntregadorRequestDTO;
import com.delivery.api.dto.EntregadorResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/entregadores")
public class EntregadorController {

    @PostMapping
    public ResponseEntity<EntregadorResponseDTO> cadastrar(
            @RequestBody EntregadorRequestDTO dto) {
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<EntregadorResponseDTO>> listar() {
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}/disponibilidade")
    public ResponseEntity<Void> atualizarDisponibilidade(
            @PathVariable UUID id,
            @RequestParam Boolean disponivel) {
        return ResponseEntity.ok().build();
    }
}
