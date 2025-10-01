package dev.java10x.CadastroDeMembros.Ministerio;

import dev.java10x.CadastroDeMembros.Usuarios.UsuarioModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "tb_cadastro_de_ministerio")
public class MinisterioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "O nome do ministério é obrigatório")
    private String nome;
    private String descricao;
    private String responsavel;
    @Email(message = "Email inválido")
    @Size(max = 150, message = "O email pode ter no máximo 150 caracteres")
    private String email;
    @Pattern(
            regexp = "^(\\+55\\s?)?\\(?\\d{2}\\)?\\s?9?\\d{4}-?\\d{4}$",
            message = "Telefone em formato inválido. Ex: +55 (11) 91234-5678"
    )
    private String telefone;
    private LocalDateTime dataCriacao = LocalDateTime.now();


    @OneToMany(mappedBy = "ministerioModel")
    private List<UsuarioModel> membroModels;


}
