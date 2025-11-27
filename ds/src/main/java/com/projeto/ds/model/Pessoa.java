package com.projeto.ds.model;

public class Pessoa {
    private String nome;
    private int idade;
    private String curso;

    public Pessoa(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Curso: " + curso;
    }
}
