package com.delivery.api.controller;

import com.delivery.api.dto.EntregaRequestDTO;
import com.delivery.api.dto.EntregaResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/entregas")
public class EntregaController {

    @PostMapping
    public ResponseEntity<EntregaResponseDTO> criarEntrega(
            @RequestBody EntregaRequestDTO dto) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EntregaResponseDTO> acompanharEntrega(
            @PathVariable UUID id) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{id}/cancelar")
    public ResponseEntity<Void> cancelarEntrega(
            @PathVariable UUID id) {
        return ResponseEntity.ok().build();
    }
}
