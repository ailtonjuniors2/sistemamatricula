package com.example.sistemamatricula.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cursos")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nome_Curso", nullable = false)
    private String nomeCurso;

    @Column(name = "Carga_horaria", nullable = false)
    private int cargaHoraria;

    private String descricao;
    private String professor;
}
