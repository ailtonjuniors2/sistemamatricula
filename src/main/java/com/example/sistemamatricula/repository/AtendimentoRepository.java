package com.example.sistemamatricula.repository;

import com.example.sistemamatricula.model.Atendimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtendimentoRepository
        extends JpaRepository<Atendimento, Long> {
}