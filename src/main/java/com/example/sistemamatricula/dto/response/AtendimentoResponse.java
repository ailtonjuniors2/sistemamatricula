package com.example.sistemamatricula.dto.response;

public record AtendimentoResponse(

        Long id,
        String status,
        String descricao,
        String atendente

) {
}