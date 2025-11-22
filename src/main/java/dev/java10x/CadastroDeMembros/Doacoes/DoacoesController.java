package dev.java10x.CadastroDeMembros.Doacoes;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/doacoes") // Boa prática: Versionamento da API
@Tag(name = "Doações", description = "Gerenciamento de dízimos e ofertas da igreja")
public class DoacoesController {

    // POST
    @Operation(summary = "Registrar uma nova doação", description = "Cria um registro de dízimo ou oferta no banco de dados")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Doação registrada com sucesso"),
            @ApiResponse(responseCode = "400", description = "Dados inválidos fornecidos")
    })
    @PostMapping
    public ResponseEntity<String> criarDoacao() {
        // TODO: Receber um DTO (Objeto de Transferência de Dados) como parâmetro (@RequestBody)
        return ResponseEntity.status(201).body("Doação criada com sucesso!");
    }

    // GET (Todos)
    @Operation(summary = "Listar todas as doações", description = "Retorna uma lista com todo o histórico de doações")
    @GetMapping
    public ResponseEntity<String> buscarTodasDoacoes() {
        return ResponseEntity.ok("Mostrando todas as doações.");
    }

    // GET (Por ID)
    @Operation(summary = "Buscar doação por ID", description = "Retorna os detalhes de uma doação específica")
    @GetMapping("/{id}") // O {id} na URL se conecta com o @PathVariable
    public ResponseEntity<String> buscarDoacaoPorId(@PathVariable Long id) {
        return ResponseEntity.ok("Mostrando doação com ID: " + id);
    }

    // PUT
    @Operation(summary = "Atualizar doação", description = "Atualiza os dados de uma doação existente pelo ID")
    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarDoacaoPorId(@PathVariable Long id) {
        return ResponseEntity.ok("Doação com ID: " + id + " foi atualizada.");
    }

    // DELETE
    @Operation(summary = "Excluir doação", description = "Remove uma doação do registro permanentemente")
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarDoacaoPorId(@PathVariable Long id) {
        return ResponseEntity.ok("Doação com ID: " + id + " foi deletada.");
    }
}