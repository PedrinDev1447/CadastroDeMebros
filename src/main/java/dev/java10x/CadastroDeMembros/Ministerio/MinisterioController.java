package dev.java10x.CadastroDeMembros.Ministerio;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/ministerios") // URL Base: http://localhost:8080/api/v1/ministerios
@Tag(name = "Ministérios", description = "Gestão de departamentos e grupos de serviço da igreja")
public class MinisterioController {

    // POST
    @Operation(summary = "Cadastrar novo ministério", description = "Cria um novo departamento ou grupo de atuação na igreja")
    @PostMapping
    public ResponseEntity<String> criarMinisterio() {
        return ResponseEntity.status(201).body("Ministério criado com sucesso!");
    }

    // GET
    @Operation(summary = "Listar todos os ministérios", description = "Retorna a lista completa de ministérios ativos")
    @GetMapping
    public ResponseEntity<String> buscarTodosMinisterios() {
        return ResponseEntity.ok("Mostrando todos os ministérios.");
    }

    // GET COM ID
    @Operation(summary = "Buscar ministério por ID", description = "Retorna os detalhes de um ministério específico")
    @GetMapping("/{id}")
    public ResponseEntity<String> buscarMinisterioPorId(@PathVariable Long id) {
        return ResponseEntity.ok("Mostrando ministério com ID: " + id);
    }

    // PUT
    @Operation(summary = "Atualizar ministério", description = "Atualiza as informações de um ministério existente")
    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarMinisterioPorId(@PathVariable Long id) {
        return ResponseEntity.ok("Ministério com ID: " + id + " foi atualizado.");
    }

    // DELETE
    @Operation(summary = "Excluir ministério", description = "Remove um ministério do cadastro")
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarMinisterioPorId(@PathVariable Long id) {
        return ResponseEntity.ok("Ministério com ID: " + id + " foi deletado.");
    }
}