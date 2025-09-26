package dev.java10x.CadastroDeMembros.Eventos;


import dev.java10x.CadastroDeMembros.Usuarios.MembroModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.util.List;

//o JPA está baixado
@Entity
@Table (name = "tb_ministerio_tabela")
public class EventosModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "O nome do evento é obrigatório")
    private String nome;
    private String descricao;
    @NotBlank(message = "O responsável é obrigatório")
    private String responsavel;
    @Pattern(regexp = "^(\\+55\\s?)?\\(?\\d{2}\\)?\\s?9?\\d{4}-?\\d{4}$",
    message = "Telefone em formato inválido. Ex: +55 (11) 91234-5678")
    private int contato ;


    @OneToMany(mappedBy = "evento")
    private List<MembroModel> membroModels;

    //Construtor vazio or No Args constructor
    public EventosModel() {
    }

    //Construtor com todos os argumentos ou allArgs constructor
    public EventosModel(String nome, String descricao, String responsavel, int contato) {
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
