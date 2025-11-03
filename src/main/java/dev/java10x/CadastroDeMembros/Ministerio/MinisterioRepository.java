package dev.java10x.CadastroDeMembros.Ministerio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface MinisterioRepository extends JpaRepository<MinisterioModel, Long> {

    /**
     * Busca um ministério pelo nome exato.
     *
     * @param nome O nome do ministério.
     * @return Um Optional contendo o ministério, se encontrado.
     * List Lista os responsaveis
     */
    Optional<MinisterioModel> findByNome(String nome);
    List<MinisterioModel> findByResponsavelContainingIgnoreCase(String responsavel);
}