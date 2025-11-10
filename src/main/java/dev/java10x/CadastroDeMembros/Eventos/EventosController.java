package dev.java10x.CadastroDeMembros.Eventos;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eventos") // URL Base para este controller
public class EventosController {

    // Criar Evento (CREATE)
    @PostMapping
    public String criarEvento() {
        // TODO: Adicionar lógica para salvar um novo evento
        return "Evento criado com sucesso!";
    }

    // Buscar todos os Eventos (READ)
    @GetMapping
    public String buscarTodosEventos() {
        // TODO: Adicionar lógica para listar todos os eventos
        return "Mostrando todos os eventos.";
    }

    // Buscar Evento por ID (READ)
    @GetMapping("/{id}")
    public String buscarEventoPorId(@PathVariable Long id) {
        // TODO: Adicionar lógica para buscar o evento com o 'id'
        return "Mostrando evento com ID: " + id;
    }

    // Atualizar Evento por ID (UPDATE)
    @PutMapping("/{id}")
    public String atualizarEventoPorId(@PathVariable Long id) {
        // TODO: Adicionar lógica para atualizar o evento com o 'id'
        return "Evento com ID: " + id + " foi atualizado.";
    }

    // Deletar Evento por ID (DELETE)
    @DeleteMapping("/{id}")
    public String deletarEventoPorId(@PathVariable Long id) {
        // TODO: Adicionar lógica para deletar o evento com o 'id'
        return "Evento com ID: " + id + " foi deletado.";
    }
}