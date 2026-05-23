package com.example.sistemamatricula.dto.request;

public record CursoRequest(

        String nomeCurso,
        int cargaHoraria,
        String descricao,
        String professor

) {
}