package dev.java10x.cadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;


@RestController
    @RequestMapping
    public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nessa rota";
    }


    // adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }

    // Mostrar ninja por id (READ)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorId() {
        return "Mostrar ninja por id";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas() {
        return "Mostrar ninja";
    }

    //Alterar dados ninja (UPDATE)
    @PutMapping("/alterar")
    public String alterarNinjaPorID() {
        return "Alterar ninja por id";
    }

    //Deletar ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarPorID() {
        return "Deletar ninja por id";
    }

}
