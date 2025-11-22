package dev.java10x.CadastroDeMembros.Eventos;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/eventos")
@Tag(name = "Eventos", description = "Gestão de eventos da igreja")
public class EventosController {

    // POST
    @Operation(summary = "Criar novo evento")
    @PostMapping
    public ResponseEntity<String> criarEvento() {
        return ResponseEntity.status(201).body("Evento criado com sucesso!");
    }

    // GET
    @Operation(summary = "Listar todos os eventos")
    @GetMapping
    public ResponseEntity<String> buscarTodosEventos() {
        return ResponseEntity.ok("Mostrando todos os eventos.");
    }

    // GET COM ID
    @Operation(summary = "Buscar evento por ID")
    @GetMapping("/{id}")
    public ResponseEntity<String> buscarEventoPorId(@PathVariable Long id) {
        return ResponseEntity.ok("Mostrando evento com ID: " + id);
    }

    // PUT
    @Operation(summary = "Atualizar evento")
    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarEventoPorId(@PathVariable Long id) {
        return ResponseEntity.ok("Evento com ID: " + id + " foi atualizado.");
    }

    // DELETE
    @Operation(summary = "Deletar evento")
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarEventoPorId(@PathVariable Long id) {
        return ResponseEntity.ok("Evento com ID: " + id + " foi deletado.");
    }
}