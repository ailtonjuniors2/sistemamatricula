package com.example.sistemamatricula.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "matricula")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_aluno")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "id_turma")
    private Turma turma;
}
