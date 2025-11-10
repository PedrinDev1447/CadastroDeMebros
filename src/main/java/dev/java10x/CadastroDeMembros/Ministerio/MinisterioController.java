package dev.java10x.CadastroDeMembros.Ministerio;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ministerios") // URL Base para este controller
public class MinisterioController {

    // Criar Ministério (CREATE)
    @PostMapping
    public String criarMinisterio() {
        // TODO: Adicionar lógica para salvar um novo ministério no banco
        return "Ministério criado com sucesso!";
    }

    // Buscar todos os Ministérios (READ)
    @GetMapping
    public String buscarTodosMinisterios() {
        // TODO: Adicionar lógica para listar todos os ministérios
        return "Mostrando todos os ministérios.";
    }

    // Buscar Ministério por ID (READ)
    @GetMapping("/{id}")
    public String buscarMinisterioPorId(@PathVariable Long id) {
        // TODO: Adicionar lógica para buscar o ministério com o 'id'
        return "Mostrando ministério com ID: " + id;
    }

    // Atualizar Ministério por ID (UPDATE)
    @PutMapping("/{id}")
    public String atualizarMinisterioPorId(@PathVariable Long id) {
        // TODO: Adicionar lógica para atualizar o ministério com o 'id'
        return "Ministério com ID: " + id + " foi atualizado.";
    }

    // Deletar Ministério por ID (DELETE)
    @DeleteMapping("/{id}")
    public String deletarMinisterioPorId(@PathVariable Long id) {
        // TODO: Adicionar lógica para deletar o ministério com o 'id'
        return "Ministério com ID: " + id + " foi deletado.";
    }
}