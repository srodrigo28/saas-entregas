package com.delivery.api.controller;

import com.delivery.api.dto.VeiculoRequestDTO;
import com.delivery.api.dto.VeiculoResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculoController {

    @PostMapping
    public ResponseEntity<VeiculoResponseDTO> cadastrar(
            @RequestBody VeiculoRequestDTO dto) {
        return ResponseEntity.ok().build();
    }
}
