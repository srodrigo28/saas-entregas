package com.delivery.api.controller;

import com.delivery.api.dto.RegraPrecoRequestDTO;
import com.delivery.api.dto.RegraPrecoResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/regras-preco")
public class RegraPrecoController {

    @PostMapping
    public ResponseEntity<RegraPrecoResponseDTO> criar(
            @RequestBody RegraPrecoRequestDTO dto) {
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<RegraPrecoResponseDTO>> listar() {
        return ResponseEntity.ok().build();
    }
}
