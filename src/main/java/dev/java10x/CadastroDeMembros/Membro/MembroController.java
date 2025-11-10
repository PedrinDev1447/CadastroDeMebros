package dev.java10x.CadastroDeMembros.Membro;

// Imports específicos são uma boa prática
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/membros") // Rota base mais intuitiva
public class MembroController {

    // Adicionar membro (CREATE)
    @PostMapping
    public String criarMembro() {
        // TODO: Lógica para salvar um novo membro no banco de dados
        return "Membro criado com sucesso!";
    }

    // Mostrar todos os membros (READ)
    @GetMapping
    public String buscarTodosMembros() {
        // TODO: Lógica para listar todos os membros do banco
        return "Mostrando todos os membros.";
    }

    // Procurar membro por ID (READ)
    @GetMapping("/{id}")
    public String buscarMembroPorId(@PathVariable Long id) {
        // TODO: Lógica para buscar o membro específico pelo 'id'
        return "Mostrando membro com ID: " + id;
    }

    // Alterar dados do membro (UPDATE)
    @PutMapping("/{id}")
    public String atualizarMembroPorId(@PathVariable Long id) {
        // TODO: Lógica para atualizar os dados do membro com o 'id'
        return "Membro com ID: " + id + " foi atualizado.";
    }

    // Deletar membro (DELETE)
    @DeleteMapping("/{id}")
    public String deletarMembroPorId(@PathVariable Long id) {
        // TODO: Lógica para deletar o membro com o 'id'
        return "Membro com ID: " + id + " foi deletado.";
    }
}