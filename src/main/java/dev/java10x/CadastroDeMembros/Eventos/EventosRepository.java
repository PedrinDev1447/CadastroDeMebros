package dev.java10x.CadastroDeMembros.Eventos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EventosRepository extends JpaRepository<EventosModel, Long> {

    /**
     * Busca um evento pelo nome exato.
     *
     * @param nome O nome do evento.
     * @return Um Optional contendo o evento, se encontrado.
     */
    Optional<EventosModel> findByNome(String nome);
    List<EventosModel> findByResponsavelContainingIgnoreCase(String responsavel);
}