package com.example.sistemamatricula.repository;

import com.example.sistemamatricula.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository
        extends JpaRepository<Matricula, Long> {

    boolean existsByAlunoId(Long alunoId);
}