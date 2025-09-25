package dev.java10x.CadastroDeMembros.Eventos;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

//o JPA está baixado
@Entity
@Table (name = "tb_ministerio_tabela")
public class EventosModel {



    private Long id;
    private String nome;
    private String descricao;
    private String responsavel;
    private int contato ;

    //Construtor vazio or No Args constructor
    public EventosModel() {
    }

    //Construtor com todos os argumentos ou allArgs constructor
    public EventosModel(Long id, String nome, String descricao, String responsavel, int contato) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.contato = contato;
    }

    //Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public int getContato() {
        return contato;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }


}
