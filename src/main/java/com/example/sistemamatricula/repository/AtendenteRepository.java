package com.example.sistemamatricula.repository;

import com.example.sistemamatricula.model.Atendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtendenteRepository
        extends JpaRepository<Atendente, Long> {

    boolean existsByCpf(String cpf);

    boolean existsByEmail(String email);
}