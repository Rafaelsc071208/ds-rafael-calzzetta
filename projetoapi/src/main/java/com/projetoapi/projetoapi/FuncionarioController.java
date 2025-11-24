package com.projetoapi.projetoapi;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {
    private final FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    // Endpoint para listar todos os funcionários
    @GetMapping
    public List<Funcionario> listar() {
        return funcionarioService.listar();
    }

    // Endpoint para adicionar um novo funcionário
    @PostMapping
    public String adicionar(@RequestBody Funcionario funcionario) {
        funcionarioService.adicionar(funcionario);
        return "Funcionário " + funcionario.getNome() + " adicionado com sucesso!";
    }

    // Endpoint para remover um funcionário pelo ID
    @DeleteMapping("/{id}")
    public String remover(@PathVariable Integer id) {
        boolean removido = funcionarioService.remover(id);
        return removido
            ? "Funcionário com ID " + id + " removido com sucesso!"
            : "Funcionário com ID " + id + " não encontrado.";
    }
}