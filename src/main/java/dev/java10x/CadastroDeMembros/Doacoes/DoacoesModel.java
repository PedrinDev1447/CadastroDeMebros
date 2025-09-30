package dev.java10x.CadastroDeMembros.Doacoes;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "tb_tabelas_de_doacoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DoacoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dizimo;
    private String doacao;
    private String contribuicaoEspecial;
    private BigDecimal valor;
    @NotNull(message = "A data é obrigatória")
    private LocalDate data;
    private boolean anonimo = false;
    @Size(max = 100, message = "O nome pode ter no máximo 100 caracteres")
    private String membro;

}