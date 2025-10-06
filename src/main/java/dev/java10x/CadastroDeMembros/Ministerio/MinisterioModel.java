package dev.java10x.CadastroDeMembros.Ministerio;

import dev.java10x.CadastroDeMembros.Membro.MembroModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "tb_ministerio")
public class MinisterioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank(message = "O nome do ministério é obrigatório")
    @Column(name = "nome", nullable = false, unique = true)
    private String nome;

    @Column(name = "descricao", columnDefinition = "TEXT")
    private String descricao;

    @NotBlank(message = "O nome do responsável é obrigatório")
    @Column(name = "responsavel")
    private String responsavel;

    @Email(message = "Email inválido")
    @Size(max = 150, message = "O email pode ter no máximo 150 caracteres")
    @Column(name = "email")
    private String email;

            @OneToMany(mappedBy = "ministerioModel")
    private List<MembroModel> ministerio;


}
