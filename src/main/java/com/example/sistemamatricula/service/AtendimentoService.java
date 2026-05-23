package com.example.sistemamatricula.service;

import com.example.sistemamatricula.model.Atendimento;
import com.example.sistemamatricula.repository.AtendimentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AtendimentoService {

    private final AtendimentoRepository repository;

    public List<Atendimento> listar() {
        return repository.findAll();
    }

    public Atendimento buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Atendimento não encontrado"));
    }

    public Atendimento salvar(
            Atendimento atendimento) {

        return repository.save(atendimento);
    }

    public Atendimento atualizar(
            Long id,
            Atendimento dados) {

        Atendimento atendimento =
                buscarPorId(id);

        atendimento.setDataHora(
                dados.getDataHora()
        );

        atendimento.setDescricao(
                dados.getDescricao()
        );

        atendimento.setStatus(
                dados.getStatus()
        );

        atendimento.setAgendamento(
                dados.getAgendamento()
        );

        atendimento.setAtendente(
                dados.getAtendente()
        );

        return repository.save(atendimento);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}