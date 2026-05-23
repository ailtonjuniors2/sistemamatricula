package com.example.sistemamatricula.service;

import com.example.sistemamatricula.model.Atendente;
import com.example.sistemamatricula.repository.AtendenteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AtendenteService {

    private final AtendenteRepository repository;

    public List<Atendente> listar() {
        return repository.findAll();
    }

    public Atendente buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Atendente não encontrado"));
    }

    public Atendente salvar(Atendente atendente) {
        return repository.save(atendente);
    }

    public Atendente atualizar(Long id, Atendente dados) {

        Atendente atendente = buscarPorId(id);

        atendente.setNomeCompleto(dados.getNomeCompleto());
        atendente.setCpf(dados.getCpf());
        atendente.setEmail(dados.getEmail());
        atendente.setTelefone(dados.getTelefone());

        return repository.save(atendente);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}