package com.example.sistemamatricula.dto.request;

import java.time.LocalDate;

public record AlunoRequest(

        String nomeCompleto,
        String cpf,
        String email,
        String telefone,
        LocalDate nascimento

) {
}