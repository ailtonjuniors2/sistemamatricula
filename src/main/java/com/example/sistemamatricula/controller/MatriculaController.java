package com.example.sistemamatricula.controller;

import com.example.sistemamatricula.model.Matricula;
import com.example.sistemamatricula.service.MatriculaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
@RequiredArgsConstructor
@CrossOrigin("*")
public class MatriculaController {

    private final MatriculaService service;

    @GetMapping
    public List<Matricula> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Matricula buscarPorId(
            @PathVariable Long id) {

        return service.buscarPorId(id);
    }

    @PostMapping
    public Matricula salvar(
            @RequestBody Matricula matricula) {

        return service.salvar(matricula);
    }

    @DeleteMapping("/{id}")
    public void deletar(
            @PathVariable Long id) {

        service.deletar(id);
    }
}