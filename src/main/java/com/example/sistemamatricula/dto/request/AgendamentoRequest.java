package com.example.sistemamatricula.dto.request;

import java.time.LocalDateTime;

public record AgendamentoRequest(

        LocalDateTime dataHora,
        Long alunoId,
        Long atendenteId

) {
}