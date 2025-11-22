package dev.java10x.CadastroDeMembros.Membro;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/membros") // URL Base Padronizada
@Tag(name = "Membros", description = "Gestão de cadastro de membros da igreja")
public class MembroController {

    // POST
    @Operation(summary = "Cadastrar novo membro", description = "Adiciona um novo membro ao banco de dados da igreja")
    @PostMapping
    public ResponseEntity<String> criarMembro() {
        // Retorna 201 (Created) para confirmar a criação
        return ResponseEntity.status(201).body("Membro criado com sucesso!");
    }

    // GET
    @Operation(summary = "Listar todos os membros", description = "Retorna a lista completa de membros ativos")
    @GetMapping
    public ResponseEntity<String> buscarTodosMembros() {
        return ResponseEntity.ok("Mostrando todos os membros.");
    }

    // GET COM ID
    @Operation(summary = "Buscar membro por ID", description = "Retorna os dados de um membro específico")
    @GetMapping("/{id}")
    public ResponseEntity<String> buscarMembroPorId(@PathVariable Long id) {
        return ResponseEntity.ok("Mostrando membro com ID: " + id);
    }


    // PUT
    @Operation(summary = "Atualizar dados do membro", description = "Atualiza as informações de cadastro de um membro")
    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarMembroPorId(@PathVariable Long id) {
        return ResponseEntity.ok("Membro com ID: " + id + " foi atualizado.");
    }

    // DELETE
    @Operation(summary = "Excluir membro", description = "Remove um membro do cadastro")
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarMembroPorId(@PathVariable Long id) {
        return ResponseEntity.ok("Membro com ID: " + id + " foi deletado.");
    }
}