package com.example.sistemamatricula.controller;

import com.example.sistemamatricula.model.Mensagem;
import com.example.sistemamatricula.service.MensagemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mensagens")
@RequiredArgsConstructor
@CrossOrigin("*")
public class MensagemController {

    private final MensagemService service;

    @GetMapping
    public List<Mensagem> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Mensagem buscarPorId(
            @PathVariable Long id) {

        return service.buscarPorId(id);
    }

    @PostMapping
    public Mensagem salvar(
            @RequestBody Mensagem mensagem) {

        return service.salvar(mensagem);
    }

    @PutMapping("/{id}")
    public Mensagem atualizar(
            @PathVariable Long id,
            @RequestBody Mensagem mensagem) {

        return service.atualizar(id, mensagem);
    }

    @DeleteMapping("/{id}")
    public void deletar(
            @PathVariable Long id) {

        service.deletar(id);
    }
}