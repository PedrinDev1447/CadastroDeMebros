package dev.java10x.CadastroDeMembros;

import jakarta.persistence.*;

//Entuty transforma uma class em uma entidade do banco de dados
//JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro_de_membros")
public class MembroModel {


    //nome, logradouro, idade, gênero e estado civil.
    //@Id + @GeneratedValue (sempre serao usadas lado a lado)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String email;
    String genero;
    String logradouro;
    int idade;


    //No argsContructor
    public MembroModel() {
    }
    //All argsConstructor
    public MembroModel(String nome, String email, String genero, String logradouro, int idade) {
        this.nome = nome;
        this.email = email;
        this.genero = genero;
        this.logradouro = logradouro;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
