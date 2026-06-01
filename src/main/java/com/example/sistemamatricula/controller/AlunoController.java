package com.example.sistemamatricula.controller;

import com.example.sistemamatricula.model.Aluno;
import com.example.sistemamatricula.service.AlunoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
@RequiredArgsConstructor
@CrossOrigin("*")
public class AlunoController {

    private final AlunoService service;

    @GetMapping
    public List<Aluno> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Aluno buscarPorId(
            @PathVariable Long id) {

        return service.buscarPorId(id);
    }

    @PostMapping
    public Aluno salvar(
           @Valid @RequestBody Aluno aluno) {

        return service.salvar(aluno);
    }

    @PutMapping("/{id}")
    public Aluno atualizar(
            @PathVariable Long id,
            @RequestBody Aluno aluno) {

        return service.atualizar(id, aluno);
    }

    @DeleteMapping("/{id}")
    public void deletar(
            @PathVariable Long id) {

        service.deletar(id);
    }
}