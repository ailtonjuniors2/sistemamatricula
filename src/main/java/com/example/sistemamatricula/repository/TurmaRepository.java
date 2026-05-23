package com.example.sistemamatricula.repository;

import com.example.sistemamatricula.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository
        extends JpaRepository<Turma, Long> {

    boolean existsByMateria(String materia);
}