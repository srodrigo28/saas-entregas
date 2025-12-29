package com.delivery.api.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class HistoricoStatusResponseDTO {

    private String status;
    private LocalDateTime dataHora;
}
