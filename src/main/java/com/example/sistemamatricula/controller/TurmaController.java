package com.example.sistemamatricula.controller;

import com.example.sistemamatricula.model.Turma;
import com.example.sistemamatricula.service.TurmaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turmas")
@RequiredArgsConstructor
@CrossOrigin("*")
public class TurmaController {

    private final TurmaService service;

    @GetMapping
    public List<Turma> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Turma buscarPorId(
            @PathVariable Long id) {

        return service.buscarPorId(id);
    }

    @PostMapping
    public Turma salvar(
            @RequestBody Turma turma) {

        return service.salvar(turma);
    }

    @PutMapping("/{id}")
    public Turma atualizar(
            @PathVariable Long id,
            @RequestBody Turma turma) {

        return service.atualizar(id, turma);
    }

    @DeleteMapping("/{id}")
    public void deletar(
            @PathVariable Long id) {

        service.deletar(id);
    }
}