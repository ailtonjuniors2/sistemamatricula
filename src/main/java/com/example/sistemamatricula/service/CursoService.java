package com.example.sistemamatricula.service;

import com.example.sistemamatricula.model.Curso;
import com.example.sistemamatricula.repository.CursoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CursoService {

    private final CursoRepository repository;

    public List<Curso> listar() {
        return repository.findAll();
    }

    public Curso buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Curso não encontrado"));
    }

    public Curso salvar(Curso curso) {
        return repository.save(curso);
    }

    public Curso atualizar(Long id, Curso dados) {

        Curso curso = buscarPorId(id);

        curso.setNomeCurso(dados.getNomeCurso());
        curso.setCargaHoraria(dados.getCargaHoraria());
        curso.setDescricao(dados.getDescricao());
        curso.setProfessor(dados.getProfessor());

        return repository.save(curso);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}