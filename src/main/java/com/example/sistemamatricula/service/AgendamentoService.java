package com.example.sistemamatricula.service;

import com.example.sistemamatricula.model.Agendamento;
import com.example.sistemamatricula.repository.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgendamentoService {

    private final AgendamentoRepository repository;

    public List<Agendamento> listar() {
        return repository.findAll();
    }

    public Agendamento buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Agendamento não encontrado"));
    }

    public Agendamento salvar(Agendamento agendamento) {

        boolean conflito =
                repository.existsByAtendenteIdAndDataHora(
                        agendamento.getAtendente().getId(),
                        agendamento.getDataHora()
                );

        if (conflito) {
            throw new RuntimeException(
                    "Horário indisponível"
            );
        }

        return repository.save(agendamento);
    }

    public Agendamento atualizar(Long id,
                                 Agendamento dados) {

        Agendamento agendamento = buscarPorId(id);

        agendamento.setDataHora(
                dados.getDataHora()
        );

        agendamento.setAluno(
                dados.getAluno()
        );

        agendamento.setAtendente(
                dados.getAtendente()
        );

        return repository.save(agendamento);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}