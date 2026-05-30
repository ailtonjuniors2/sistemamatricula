package com.example.sistemamatricula.service;

import com.example.sistemamatricula.model.Aluno;
import com.example.sistemamatricula.repository.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoService {

    private final AlunoRepository repository;

    public List<Aluno> listar() {
        return repository.findAll();
    }

    public Aluno buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Aluno não encontrado"));
    }

    public Aluno salvar(Aluno aluno) {
        return repository.save(aluno);
    }

    public Aluno atualizar(Long id, Aluno dados) {

        Aluno aluno = buscarPorId(id);

        aluno.setNomeCompleto(dados.getNomeCompleto());
        aluno.setCpf(dados.getCpf());
        aluno.setEmail(dados.getEmail());
        aluno.setTelefone(dados.getTelefone());
        aluno.setNascimento(dados.getNascimento());
        aluno.setSenha(dados.getSenha());

        return repository.save(aluno);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}