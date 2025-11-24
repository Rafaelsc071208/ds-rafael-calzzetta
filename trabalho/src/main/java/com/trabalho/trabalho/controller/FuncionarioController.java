package com.trabalho.trabalho.controller;

import com.trabalho.trabalho.model.Funcionario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private List<Funcionario> funcionarios = new ArrayList<>();

    @PostMapping("/add")
    public String adicionarFuncionario(@RequestBody Funcionario funcionario) {
        funcionarios.add(funcionario);
        return "Funcionário adicionado!";
    }

    @DeleteMapping("/remove/{id}")
    public String removerFuncionario(@PathVariable int id) {
        funcionarios.removeIf(f -> f.getId() == id);
        return "Funcionário removido (se existia).";
    }

    @GetMapping("/listar")
    public List<Funcionario> listarFuncionarios() {
        return funcionarios;
    }
}
