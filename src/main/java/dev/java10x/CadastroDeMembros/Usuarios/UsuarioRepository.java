package dev.java10x.CadastroDeMembros.Usuarios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
    /**
     * @param email O e-mail a ser pesquisado.
     * @return Um Optional contendo o usuário, se encontrado.
     * List busca todos os usuarios
     */
    Optional<UsuarioModel> findByEmail(String email);
    List<UsuarioModel> findByNomeContainingIgnoreCase(String nome);
    List<UsuarioModel> findByIdade(int idade);
}
