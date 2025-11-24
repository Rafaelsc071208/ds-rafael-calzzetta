package com.example.prova;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class ProvaService {
    private final Map<Integer, String> funcionarios = new HashMap<>();

    public Map<Integer, String> listar() {
        return funcionarios;
    }

    public boolean adicionar(Integer id, String nome) {
        if (funcionarios.containsKey(id)) {
            return false;
        }
        funcionarios.put(id, nome);
        return true;
    }

    public boolean remover(Integer id) {
        return funcionarios.remove(id) != null;
    }
}