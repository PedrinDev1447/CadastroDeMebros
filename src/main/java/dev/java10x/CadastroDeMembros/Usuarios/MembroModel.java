package dev.java10x.CadastroDeMembros.Usuarios;

import dev.java10x.CadastroDeMembros.Eventos.EventosController;
import dev.java10x.CadastroDeMembros.Eventos.EventosModel;
import dev.java10x.CadastroDeMembros.Ministerio.MinisterioModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.text.DateFormat;

//Entuty transforma uma class em uma entidade do banco de dados
//JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro_de_membros")
public class MembroModel {
    //nome, logradouro, idade, gênero e estado civil.
    //@Id + @GeneratedValue (sempre serao usadas lado a lado)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "O nome é obrigatótio")
    @Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres")
    private String nome;
    private String email;
    @NotBlank(message = "O gênero é obrigatório")
    private String genero;
    @NotBlank(message = "O logradouro é obrigatório")
    private String logradouro;
    @Past(message = "Data de nascimento deve ser colocada no passado")
    private DateFormat dataDeNascimento;
    @Min(value = 0, message =  "Idade não pode ser negativa")
    @Max(value = 120, message = "Idade nao pode ser maior que 120 anos")
    private int idade;


    @ManyToOne
    @JoinColumn(name = "ministerios_id") //Foreing key ou chave estrangeira
    private MinisterioModel ministerioModel;
    @ManyToOne
    @JoinColumn(name = "eventos_id") //Foreing key ou chave estrangeira
    private EventosModel eventosModel;

    //No argsContructor
    public MembroModel() {
    }
    //All argsConstructor
    public MembroModel(String nome, String email, String genero, String logradouro,DateFormat dataDeNascimento, int idade) {
        this.nome = nome;
        this.email = email;
        this.genero = genero;
        this.logradouro = logradouro;
        this.dataDeNascimento = dataDeNascimento;
        this.idade = idade;
    }

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

    public DateFormat getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(DateFormat dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
