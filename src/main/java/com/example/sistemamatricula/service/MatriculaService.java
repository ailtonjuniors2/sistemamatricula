package com.example.sistemamatricula.service;

import com.example.sistemamatricula.model.*;
import com.example.sistemamatricula.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MatriculaService {

    private final MatriculaRepository repository;

    public List<Matricula> listar() {
        return repository.findAll();
    }

    public Matricula buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Matrícula não encontrada"));
    }

    public Matricula salvar(Matricula matricula) {

        boolean existe =
                repository.existsByAlunoId(
                        matricula.getAluno().getId()
                );

        if (existe) {
            throw new RuntimeException(
                    "Aluno já matriculado"
            );
        }

        return repository.save(matricula);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}