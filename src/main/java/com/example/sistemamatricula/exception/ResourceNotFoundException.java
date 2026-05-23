package com.example.sistemamatricula.exception;

public class ResourceNotFoundException
        extends RuntimeException {

    public ResourceNotFoundException(
            String mensagem) {

        super(mensagem);
    }
}