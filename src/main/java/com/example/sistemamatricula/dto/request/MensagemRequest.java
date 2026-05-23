package com.example.sistemamatricula.dto.request;

public record MensagemRequest(

        String mensagem,
        Long alunoId,
        Long atendenteId

) {
}