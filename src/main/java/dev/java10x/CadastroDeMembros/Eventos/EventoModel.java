package dev.java10x.CadastroDeMembros.Evento; // 1. Pacote renomeado para singular

import dev.java10x.CadastroDeMembros.Membro.MembroModel;
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
@Entity
@Table(name = "tb_evento")
public class EventoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evento")
    private Long id;

    @NotBlank(message = "O nome do evento é obrigatório")
    @Column(name = "nome_evento")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @NotBlank(message = "O responsável é obrigatório")
    @Column(name = "responsavel")
    private String responsavel;

    @Pattern(regexp = "^(\\+55\\s?)?\\(?\\d{2}\\)?\\s?9?\\d{4}-?\\d{4}$",
            message = "Telefone em formato inválido. Ex: +55 (11) 91234-5678")
    @Column(name = "contato")
    private String contato;

    @Column(name = "endereco")
    private String endereco;


    @OneToMany(mappedBy = "evento", fetch = FetchType.LAZY)
    private List<MembroModel> participantes;
}