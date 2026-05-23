package com.example.sistemamatricula.dto.response;

import java.time.LocalDateTime;

public record MensagemResponse(

        Long id,
        String mensagem,
        LocalDateTime data,
        String aluno,
        String atendente

) {
}