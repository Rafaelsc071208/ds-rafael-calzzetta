package com.projeto.ds.service;

import org.springframework.stereotype.Service;

import com.projeto.ds.model.Pessoa;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Service
public class PessoaService {

    private static final String FILE_NAME = "pessoas.txt";

    public void salvarPessoa(String nome, int idade, String curso) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(nome + "," + idade + "," + curso + "\n");
            System.out.println("✔ Pessoa salva com sucesso!");
        } catch (IOException e) {
            System.out.println("❌ Erro ao salvar pessoa!");
        }
    }

    public void listarPessoas() {
        try {
            System.out.println("\n📋 Pessoas cadastradas:");
            List<String> linhas = Files.readAllLines(Path.of(FILE_NAME));
            if (linhas.isEmpty()) {
                System.out.println("Nenhuma pessoa cadastrada.");
            } else {
                linhas.forEach(System.out::println);
            }
        } catch (IOException e) {
            System.out.println("❌ Erro ao ler arquivo!");
        }
    }
}
