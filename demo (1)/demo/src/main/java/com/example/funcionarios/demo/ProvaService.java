package com.example.prova;
import org.springframework.streotype.Service;
import java,util.*;
@Service
public class ProvaService {
    private final Set<Integer> funcionarios = new HashSet<>();
    public Set<Integer> listar() {
        return funcionarios;
    }
    public boolean adicionar(Integer id) {
        return funcionarios.add(id);
    }
    public boolean remover(Integer id) {
        return funcionarios.remove(id);
    }
}