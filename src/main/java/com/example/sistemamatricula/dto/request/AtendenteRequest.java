package com.example.sistemamatricula.dto.request;

public record AtendenteRequest(

        String nomeCompleto,
        String cpf,
        String email,
        String telefone

) {
}