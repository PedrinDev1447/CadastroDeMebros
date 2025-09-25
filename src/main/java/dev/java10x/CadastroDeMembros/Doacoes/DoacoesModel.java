package dev.java10x.CadastroDeMembros.Doacoes;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "tb_tabelas_de_doacoes")
public class DoacoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String dizimo, doacao, contribuicaoEspecial;
    private BigDecimal valor;
    private DateTimeFormatter data;
    private String membro;

    public DoacoesModel() {
    }

    public DoacoesModel(int id, String dizimo, String doacao, String contribuicaoEspecial, BigDecimal valor, DateTimeFormatter data, String membro) {
        this.id = id;
        this.dizimo = dizimo;
        this.doacao = doacao;
        this.contribuicaoEspecial = contribuicaoEspecial;
        this.valor = valor;
        this.data = data;
        this.membro = membro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDizimo() {
        return dizimo;
    }

    public void setDizimo(String dizimo) {
        this.dizimo = dizimo;
    }

    public String getDoacao() {
        return doacao;
    }

    public void setDoacao(String doacao) {
        this.doacao = doacao;
    }

    public String getContribuicaoEspecial() {
        return contribuicaoEspecial;
    }

    public void setContribuicaoEspecial(String contribuicaoEspecial) {
        this.contribuicaoEspecial = contribuicaoEspecial;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public DateTimeFormatter getData() {
        return data;
    }

    public void setData(DateTimeFormatter data) {
        this.data = data;
    }

    public String getMembro() {
        return membro;
    }

    public void setMembro(String membro) {
        this.membro = membro;
    }
}
