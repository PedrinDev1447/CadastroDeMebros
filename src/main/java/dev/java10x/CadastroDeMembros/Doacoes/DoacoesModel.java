package dev.java10x.CadastroDeMembros.Doacoes;

import dev.java10x.CadastroDeMembros.Membro.MembroModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "tb_doacoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DoacoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * Tipo da doação (Dízimo, Oferta, etc.).
     * @Enumerated(EnumType.STRING) armazena o nome do enum ("DIZIMO", "OFERTA") no banco de dados.
     * Isso torna os dados na tabela muito mais legíveis do que usar números (EnumType.ORDINAL).
     */
    @NotNull(message = "O tipo da doação é obrigatório")
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_doacao", nullable = false)
    private TipoDoacao tipo;

    @NotNull(message = "O valor é obrigatório")
    @Column(name = "valor_doacao", nullable = false)
    private BigDecimal valor;

    @NotNull(message = "A data é obrigatória")
    @Column(name = "data_doacao", nullable = false)
    private LocalDate data;

    @Column(name = "doacao_anonima", nullable = false)
    private boolean anonimo = false;

    @ManyToOne
    @JoinColumn(name = "membro_id", nullable = true)
    private MembroModel membro;

}