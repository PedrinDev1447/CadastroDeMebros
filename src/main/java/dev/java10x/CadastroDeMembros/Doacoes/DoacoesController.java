package dev.java10x.CadastroDeMembros.Doacoes;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doacoes") // URL Base para este controller
public class DoacoesController {

    // Registrar Doação (CREATE)
    @PostMapping
    public String registrarDoacao() {
        // TODO: Adicionar lógica para salvar uma nova doação
        return "Doação registrada com sucesso!";
    }

    // Buscar todas as Doações (READ)
    @GetMapping
    public String buscarTodasDoacoes() {
        // TODO: Adicionar lógica para listar todas as doações
        return "Mostrando todas as doações.";
    }

    // Buscar Doação por ID (READ)
    @GetMapping("/{id}")
    public String buscarDoacaoPorId(@PathVariable Long id) {
        // TODO: Adicionar lógica para buscar a doação com o 'id'
        return "Mostrando doação com ID: " + id;
    }

    // Atualizar Doação por ID (UPDATE)
    @PutMapping("/{id}")
    public String atualizarDoacaoPorId(@PathVariable Long id) {
        // TODO: Adicionar lógica para atualizar a doação com o 'id'
        return "Doação com ID: " + id + " foi atualizada.";
    }

    // Deletar Doação por ID (DELETE)
    @DeleteMapping("/{id}")
    public String deletarDoacaoPorId(@PathVariable Long id) {
        // TODO: Adicionar lógica para deletar a doação com o 'id'
        return "Doação com ID: " + id + " foi deletada.";
    }
}