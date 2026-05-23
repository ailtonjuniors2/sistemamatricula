package com.example.sistemamatricula.controller;

import com.example.sistemamatricula.model.Curso;
import com.example.sistemamatricula.service.CursoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
@RequiredArgsConstructor
@CrossOrigin("*")
public class CursoController {

    private final CursoService service;

    @GetMapping
    public List<Curso> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Curso buscarPorId(
            @PathVariable Long id) {

        return service.buscarPorId(id);
    }

    @PostMapping
    public Curso salvar(
            @RequestBody Curso curso) {

        return service.salvar(curso);
    }

    @PutMapping("/{id}")
    public Curso atualizar(
            @PathVariable Long id,
            @RequestBody Curso curso) {

        return service.atualizar(id, curso);
    }

    @DeleteMapping("/{id}")
    public void deletar(
            @PathVariable Long id) {

        service.deletar(id);
    }
}