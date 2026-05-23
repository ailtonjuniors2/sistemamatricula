package com.example.sistemamatricula.dto.response;

import java.time.LocalDateTime;

public record AgendamentoResponse(

        Long id,
        LocalDateTime dataHora,
        String aluno,
        String atendente

) {
}