package dev.java10x.CadastroDeMembros.Membro;

import dev.java10x.CadastroDeMembros.Ministerio.MinisterioModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

//Entity transforma uma class numa entidade do banco de dados
//JPA = Java Persistence API
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "tb_membro")
public class MembroModel {
    //nome, logradouro, idade, gênero e estado civil.
    //@Id + @GeneratedValue (sempre serao usadas lado a lado)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    @Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres")
    @Column(name = "nome")
    private String nome;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @NotBlank(message = "O gênero é obrigatório")
    @Enumerated(EnumType.STRING)
    @Column(name = "genero")
    private GeneroEnum genero;

    @NotBlank(message = "O endereço é obrigatório")
    @Column(name = "endereco")
    private String endereco;

    @Past(message = "Data de nascimento deve ser colocada no passado")
    @Column(name = "data_nascimento" )
    private LocalDate dataDeNascimento;

    @Min(value = 0, message =  "Idade não pode ser negativa")
    @Max(value = 120, message = "Idade nao pode ser maior que 120 anos")
    @Column(name = "idade" )
    private int idade;

    @Past(message = "Data de casamento deve ser colocada no passado")
    @Column(name = "data_casamento" )
    private LocalDate dataCasamento;
    @ManyToOne
    @JoinColumn(name = "ministerios_id") //Foreing key ou chave estrangeira
    private MinisterioModel ministerio;
    @ManyToMany
    @JoinTable(name = "tb_membro_evento",
            joinColumns = @JoinColumn(name = "id_membro"),
            inverseJoinColumns = @JoinColumn(name = "id_evento")) //Foreing key ou chave estrangeira
    private List<dev.java10x.CadastroDeMembros.Membro.EventoModel> evento;


}
