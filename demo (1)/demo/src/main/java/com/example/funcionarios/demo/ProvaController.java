package com.exemple.prova;
import
org.springframework.web.bind.annotation;
import java.util.set;
@Restcontroller
@Requestmapping("/api/prova")
public class prova controller {
private final FuncionarioService funcionarioService;
public prova controller(FuncionarioService funcionarioService) {
this.funcionarioService = funcionarioService;
}
@GetMapping
public set <integer> listar() {
    return service .listar();
}
@Postmapping("{/id}")
public string adicionar(@Pathvariable integer id) {
    boolean removido = service remover(id);
    return adicionado ? "Funcionario "+id+" adicionado com sucesso" : "Falha ao adicionar funcionario";

}
@Deletemapping("{/id}")
public string remover(@Pathvariable integer id) {
    boolean removido = service .remover(id);
    return removido ? "Funcionario "+id+" removido com sucesso" : "Falha ao remover funcionario";
}
}