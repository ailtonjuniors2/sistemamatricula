package com.example.sistemamatricula.controller;

import com.example.sistemamatricula.model.Agendamento;
import com.example.sistemamatricula.service.AgendamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agendamentos")
@RequiredArgsConstructor
@CrossOrigin("*")
public class AgendamentoController {

    private final AgendamentoService service;

    @GetMapping
    public List<Agendamento> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Agendamento buscarPorId(
            @PathVariable Long id) {

        return service.buscarPorId(id);
    }

    @PostMapping
    public Agendamento salvar(
            @RequestBody Agendamento agendamento) {

        return service.salvar(agendamento);
    }

    @PutMapping("/{id}")
    public Agendamento atualizar(
            @PathVariable Long id,
            @RequestBody Agendamento agendamento) {

        return service.atualizar(id, agendamento);
    }

    @DeleteMapping("/{id}")
    public void deletar(
            @PathVariable Long id) {

        service.deletar(id);
    }
}