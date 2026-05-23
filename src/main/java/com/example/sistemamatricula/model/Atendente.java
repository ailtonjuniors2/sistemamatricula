package com.example.sistemamatricula.model;

import jakarta.persistence.*;
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
}
