package dev.java10x.CadastroDeMembros.Doacoes;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "tb_tabelas_de_doacoes")
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

    public DoacoesModel() {}

    public DoacoesModel(String dizimo, String doacao, String contribuicaoEspecial, BigDecimal valor, LocalDate data, boolean anonimo, String membro) {
        this.dizimo = dizimo;
        this.doacao = doacao;
        this.contribuicaoEspecial = contribuicaoEspecial;
        this.valor = valor;
        this.data = data;
        this.anonimo = anonimo;
        this.membro = membro;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDizimo() { return dizimo; }
    public void setDizimo(String dizimo) { this.dizimo = dizimo; }

    public String getDoacao() { return doacao; }
    public void setDoacao(String doacao) { this.doacao = doacao; }

    public String getContribuicaoEspecial() { return contribuicaoEspecial; }
    public void setContribuicaoEspecial(String contribuicaoEspecial) { this.contribuicaoEspecial = contribuicaoEspecial; }

    public BigDecimal getValor() { return valor; }
    public void setValor(BigDecimal valor) { this.valor = valor; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public boolean isAnonimo() { return anonimo; }
    public void setAnonimo(boolean anonimo) { this.anonimo = anonimo; }

    public String getMembro() {
        if (anonimo) {
            return "Anônimo"; // nunca retorna o nome real se a doação for anônima
        }
        return membro;
    }
    public void setMembro(String membro) { this.membro = membro; }
}
