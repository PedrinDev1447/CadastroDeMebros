package dev.java10x.CadastroDeMembros.Doacoes;

import dev.java10x.CadastroDeMembros.Membro.MembroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DoacoesRepository extends JpaRepository<DoacoesModel, Long> {

    /**
     * Busca todas as doações feitas por um membro específico.
     *
     * @param membro O nome do membro.
     * @return Uma lista de doações feitas pelo membro.
     */
    List<DoacoesModel> findByMembro(MembroModel membro);

    /**
     * Busca todas as doações realizadas em uma data específica.
     *
     * @param data A data da doação.
     * @return Uma lista de doações na data especificada.
     */
    List<DoacoesModel> findByData(LocalDate data);

    /**
     * Busca todas as doações dentro de um intervalo de datas.
     *
     * @param dataInicio A data de início do período.
     * @param dataFim    A data de fim do período.
     * @return Uma lista de doações dentro do intervalo.
     */
    List<DoacoesModel> findByDataBetween(LocalDate dataInicio, LocalDate dataFim);

    /**
     * Busca todas as doações anônimas.
     * @param anonimo O status de anônimo (true para anônimas).
     * @return Uma lista de doações anônimas.
     */
    List<DoacoesModel> findByAnonimo(boolean anonimo);
}