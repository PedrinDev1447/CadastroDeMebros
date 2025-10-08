package dev.java10x.CadastroDeMembros.Eventos;


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
//o JPA está baixado
@Entity
@Table (name = "tb_Evento")
public class EventosModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_eventos")
    private Long id;
    @NotBlank(message = "O nome do evento é obrigatório")
    @Column(name = "eventos")
    private String nome;
    @Column(name = "descricao_eventos")
    private String descricao;
    @NotBlank(message = "O responsável é obrigatório")
    @Column(name = "responsavel_eventos")
    private String responsavel;
    @Pattern(regexp = "^(\\+55\\s?)?\\(?\\d{2}\\)?\\s?9?\\d{4}-?\\d{4}$",
    message = "Telefone em formato inválido. Ex: +55 (11) 91234-5678")
    @Column(name = "contato_evento")
    private String contato ;


    @OneToMany(mappedBy = "evento", fetch = FetchType.LAZY)
    private List<MembroModel> participantes;



}
