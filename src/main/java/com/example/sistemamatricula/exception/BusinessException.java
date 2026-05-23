package com.example.sistemamatricula.exception;

public class BusinessException
        extends RuntimeException {

    public BusinessException(
            String mensagem) {

        super(mensagem);
    }
}