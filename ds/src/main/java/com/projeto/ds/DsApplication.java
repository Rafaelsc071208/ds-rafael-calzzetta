package com.projeto.ds;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.projeto.ds.service.PessoaService;

import java.util.Scanner;

@SpringBootApplication
public class DsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsApplication.class, args);
    }

    @Bean
    public CommandLineRunner executar(PessoaService pessoaService) {
        return args -> {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();

            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.print("Digite seu curso: ");
            String curso = sc.nextLine();

            pessoaService.salvarPessoa(nome, idade, curso);
            pessoaService.listarPessoas();

            sc.close();
        };
    }
}
