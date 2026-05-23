package com.example.sistemamatricula.dto.request;

public record AtendimentoRequest(

        String status,
        String descricao,
        Long agendamentoId,
        Long atendenteId

) {
}