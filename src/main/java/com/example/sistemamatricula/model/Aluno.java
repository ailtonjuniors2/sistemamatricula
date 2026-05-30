package com.example.sistemamatricula.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Entity
@Table(name = "aluno")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Aluno extends Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nome_Completo", nullable = false)
    private String nomeCompleto;

    @Column(unique = true, nullable = false)
    @CPF
    private String cpf;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private LocalDate nascimento;
}
