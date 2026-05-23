package com.example.sistemamatricula.repository;

import com.example.sistemamatricula.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository
        extends JpaRepository<Curso, Long> {

    boolean existsByNomeCurso(String nomeCurso);
}