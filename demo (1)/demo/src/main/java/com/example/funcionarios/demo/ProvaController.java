package com.example.prova;

import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/api/prova")
public class ProvaController {
    private final ProvaService funcionarioService;

    public ProvaController(ProvaService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

 @GetMapping
    public Map<Integer, String> listar() {
        return funcionarioService.listar();
    }

    @PostMapping("/{id}")
    public String adicionar(@PathVariable Integer id, @RequestParam String nome) {
        boolean adicionado = funcionarioService.adicionar(id, nome);
        return adicionado
            ? "Funcionario " + nome + " (ID: " + id + ") adicionado com sucesso"
            : "Falha ao adicionar funcionario. ID já existe.";
    }

    @DeleteMapping("/{id}")
    public String remover(@PathVariable Integer id) {
        boolean removido = funcionarioService.remover(id);
        return removido
            ? "Funcionario com ID " + id + " removido com sucesso"
            : "Falha ao remover funcionario. ID não encontrado.";
    }
}