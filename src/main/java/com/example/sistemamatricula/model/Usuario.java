package com.example.sistemamatricula.model;

import jakarta.validation.constraints.Size;

public class Usuario {
    @Size(min = 9, max = 9)
    private String senha;
}
