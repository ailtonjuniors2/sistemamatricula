package com.example.sistemamatricula.dto.response;

import java.time.LocalDate;

public record AlunoResponse(

        Long id,
        String nomeCompleto,
        String cpf,
        String email,
        String telefone,
        LocalDate nascimento

) {
}