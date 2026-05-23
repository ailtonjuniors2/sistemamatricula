package com.example.sistemamatricula.dto.response;

public record CursoResponse(

        Long id,
        String nomeCurso,
        int cargaHoraria,
        String descricao,
        String professor

) {
}