package com.example.sistemamatricula.model;

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

    @OneToOne
    @JoinColumn(name = "id_aluno", unique = true)
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "id_turma")
    private Turma turma;
}
