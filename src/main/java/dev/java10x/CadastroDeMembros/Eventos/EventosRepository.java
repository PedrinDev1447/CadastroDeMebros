package dev.java10x.CadastroDeMembros.Eventos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
// CORRIJA AQUI
public interface EventosRepository extends JpaRepository<dev.java10x.CadastroDeMembros.Membro.EventoModel, Long> {

    /**
     * Busca um evento pelo nome exato.
     *
     * @param nome O nome do evento.
     * @return Um Optional contendo o evento, se encontrado.
     */
    // CORRIJA AQUI
    Optional<dev.java10x.CadastroDeMembros.Membro.EventoModel> findByNome(String nome);

    // CORRIJA AQUI
    List<dev.java10x.CadastroDeMembros.Membro.EventoModel> findByResponsavelContainingIgnoreCase(String responsavel);
}