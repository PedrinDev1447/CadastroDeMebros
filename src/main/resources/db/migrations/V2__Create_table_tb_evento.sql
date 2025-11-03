CREATE TABLE tb_evento (
    -- @Id, @GeneratedValue, @Column(name = "id_evento"), Long id
    id_evento BIGINT AUTO_INCREMENT PRIMARY KEY,

    -- @NotBlank, @Column(name = "nome_evento"), String nome
    nome_evento VARCHAR(255) NOT NULL,

    -- @Column(name = "descricao"), String descricao
    descricao VARCHAR(255),

    -- @NotBlank, @Column(name = "responsavel"), String responsavel
    responsavel VARCHAR(255) NOT NULL,

    -- @Pattern, @Column(name = "contato"), String contato
    contato VARCHAR(255),

    -- @Column(name = "endereco"), String endereco
    endereco VARCHAR(255)
);