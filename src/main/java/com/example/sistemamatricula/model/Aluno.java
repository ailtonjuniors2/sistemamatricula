package com.example.sistemamatricula.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "aluno")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nome_Completo", nullable = false)
    private String nomeCompleto;

    @Column(unique = true, nullable = false)
    private String cpf;

    @Column(nullable = false)
    private String email;

    private String telefone;

    @Column(nullable = false)
    private LocalDate nascimento;
}
