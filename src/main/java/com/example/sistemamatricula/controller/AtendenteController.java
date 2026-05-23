package com.example.sistemamatricula.controller;

import com.example.sistemamatricula.model.Atendente;
import com.example.sistemamatricula.service.AtendenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atendentes")
@RequiredArgsConstructor
@CrossOrigin("*")
public class AtendenteController {

    private final AtendenteService service;

    @GetMapping
    public List<Atendente> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Atendente buscarPorId(
            @PathVariable Long id) {

        return service.buscarPorId(id);
    }

    @PostMapping
    public Atendente salvar(
            @RequestBody Atendente atendente) {

        return service.salvar(atendente);
    }

    @PutMapping("/{id}")
    public Atendente atualizar(
            @PathVariable Long id,
            @RequestBody Atendente atendente) {

        return service.atualizar(id, atendente);
    }

    @DeleteMapping("/{id}")
    public void deletar(
            @PathVariable Long id) {

        service.deletar(id);
    }
}