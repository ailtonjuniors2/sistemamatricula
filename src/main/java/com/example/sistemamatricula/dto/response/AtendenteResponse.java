package com.example.sistemamatricula.dto.response;

public record AtendenteResponse(

        Long id,
        String nomeCompleto,
        String cpf,
        String email,
        String telefone

) {
}