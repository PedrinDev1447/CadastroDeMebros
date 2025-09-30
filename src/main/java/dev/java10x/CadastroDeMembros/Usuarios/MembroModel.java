package dev.java10x.CadastroDeMembros.Usuarios;

import dev.java10x.CadastroDeMembros.Eventos.EventosController;
import dev.java10x.CadastroDeMembros.Eventos.EventosModel;
import dev.java10x.CadastroDeMembros.Ministerio.MinisterioModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DateFormat;

//Entuty transforma uma class em uma entidade do banco de dados
//JPA = Java Persistence API
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
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


}
