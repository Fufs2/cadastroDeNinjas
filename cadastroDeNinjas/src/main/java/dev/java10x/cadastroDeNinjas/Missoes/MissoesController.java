package dev.java10x.cadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    //POST - MANDAR UMA REQUISIÇÃO PARA CRIAR
    @PostMapping("/criar")
    public String criarMissao(){
        return "Missao criada";
    }

    //PUT - MANDAR REQUISIÇÃO PARA ALTERAR AS MISSOES
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missao alterada";
    }

    //DELETE - MANDAR UMA REQUISIÇÃO PARA DELETAR UMA MISSAO
    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missao deletada";
    }

    //GET - MANDAR UMA REQUISIÇÃO PARA MOSTRAR AS MISSOES
    @GetMapping("/listar")
    public String listarMissoes(){
        return "Lista de missoes";
    }
}
