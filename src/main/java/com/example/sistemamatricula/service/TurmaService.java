package com.example.sistemamatricula.service;

import com.example.sistemamatricula.model.Turma;
import com.example.sistemamatricula.repository.TurmaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TurmaService {

    private final TurmaRepository repository;

    public List<Turma> listar() {
        return repository.findAll();
    }

    public Turma buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Turma não encontrada"));
    }

    public Turma salvar(Turma turma) {
        return repository.save(turma);
    }

    public Turma atualizar(Long id, Turma dados) {

        Turma turma = buscarPorId(id);

        turma.setProfessor(dados.getProfessor());
        turma.setMateria(dados.getMateria());

        return repository.save(turma);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}