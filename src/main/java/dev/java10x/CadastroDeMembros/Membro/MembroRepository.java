package dev.java10x.CadastroDeMembros.Membro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
@Repository
public interface MembroRepository extends JpaRepository<MembroModel, Long> {
    /**
     * @param email O e-mail a ser pesquisado.
     * @return Um Optional contendo o usuário, se encontrado.
     * List busca todos os usuarios
     */
    Optional<MembroModel> findByEmail(String email);
    List<MembroModel> findByNomeContainingIgnoreCase(String nome);
    List<MembroModel> findByIdade(int idade);
}
