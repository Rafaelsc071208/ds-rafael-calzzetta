package com.trabalho.trabalho;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository repository;

    @GetMapping
    public List<Funcionario> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Funcionario adicionar(@RequestBody Funcionario funcionario) {
        return repository.save(funcionario);
    }

    @GetMapping("/{id}")
    public Funcionario buscarPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
