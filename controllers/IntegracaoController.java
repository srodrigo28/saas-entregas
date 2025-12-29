package com.delivery.api.controller;

import com.delivery.api.dto.IntegracaoRequestDTO;
import com.delivery.api.dto.IntegracaoResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/integracoes")
public class IntegracaoController {

    @PostMapping
    public ResponseEntity<IntegracaoResponseDTO> criar(
            @RequestBody IntegracaoRequestDTO dto) {
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<IntegracaoResponseDTO>> listar() {
        return ResponseEntity.ok().build();
    }
}
