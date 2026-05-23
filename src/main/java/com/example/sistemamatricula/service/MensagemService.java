package com.example.sistemamatricula.service;

import com.example.sistemamatricula.model.Mensagem;
import com.example.sistemamatricula.repository.MensagemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MensagemService {

    private final MensagemRepository repository;

    public List<Mensagem> listar() {
        return repository.findAll();
    }

    public Mensagem buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Mensagem não encontrada"));
    }

    public Mensagem salvar(Mensagem mensagem) {

        mensagem.setData(
                LocalDateTime.now()
        );

        return repository.save(mensagem);
    }

    public Mensagem atualizar(
            Long id,
            Mensagem dados) {

        Mensagem mensagem =
                buscarPorId(id);

        mensagem.setMensagem(
                dados.getMensagem()
        );

        mensagem.setAluno(
                dados.getAluno()
        );

        mensagem.setAtendente(
                dados.getAtendente()
        );

        return repository.save(mensagem);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}