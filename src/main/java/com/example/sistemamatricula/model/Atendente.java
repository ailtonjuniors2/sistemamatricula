package com.example.sistemamatricula.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name = "Atendente")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Atendente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nome_Completo", nullable = false)
    private String nomeCompleto;

    @Column(unique = true, nullable = false)
    private String cpf;

    @Column(nullable = false)
    private String email;
    
    @Column(nullable = false)
    private String telefone;

    @Size(min = 9, max = 9, message = "A senha deve possuir entre 6 e 9 caracteres")
    private String senha;
}
