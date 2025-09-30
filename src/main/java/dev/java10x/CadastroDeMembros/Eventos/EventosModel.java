package dev.java10x.CadastroDeMembros.Eventos;


import dev.java10x.CadastroDeMembros.Usuarios.MembroModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
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


    @OneToMany(mappedBy = "eventosModel")
    private List<MembroModel> membroModels;



}
