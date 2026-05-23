package com.example.sistemamatricula.controller;

import com.example.sistemamatricula.model.Atendimento;
import com.example.sistemamatricula.service.AtendimentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atendimentos")
@RequiredArgsConstructor
@CrossOrigin("*")
public class AtendimentoController {

    private final AtendimentoService service;

    @GetMapping
    public List<Atendimento> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Atendimento buscarPorId(
            @PathVariable Long id) {

        return service.buscarPorId(id);
    }

    @PostMapping
    public Atendimento salvar(
            @RequestBody Atendimento atendimento) {

        return service.salvar(atendimento);
    }

    @PutMapping("/{id}")
    public Atendimento atualizar(
            @PathVariable Long id,
            @RequestBody Atendimento atendimento) {

        return service.atualizar(id, atendimento);
    }

    @DeleteMapping("/{id}")
    public void deletar(
            @PathVariable Long id) {

        service.deletar(id);
    }
}