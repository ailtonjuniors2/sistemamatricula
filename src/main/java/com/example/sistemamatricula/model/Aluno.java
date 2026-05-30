package com.example.sistemamatricula.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

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
    @CPF
    private String cpf;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private LocalDate nascimento;

    @Size(min = 9, max = 9, message = "A senha deve possuir entre 6 e 9 caracteres")
    private String senha;
}
