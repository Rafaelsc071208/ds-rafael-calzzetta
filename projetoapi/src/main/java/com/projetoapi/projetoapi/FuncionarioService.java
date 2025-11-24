package com.projetoapi.projetoapi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FuncionarioService {
    private final List<Funcionario> funcionarios = new ArrayList<>();

    // Retorna a lista de funcionários
    public List<Funcionario> listar() {
        return funcionarios;
    }

    // Adiciona um novo funcionário
    public void adicionar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    // Remove um funcionário pelo ID
    public boolean remover(Integer id) {
        return funcionarios.removeIf(funcionario -> funcionario.getId().equals(id));
    }
}