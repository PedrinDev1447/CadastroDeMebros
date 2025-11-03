CREATE TABLE tb_ministerio (
    -- @Id, @GeneratedValue, @Column(name = "id"), Long id
    id BIGINT AUTO_INCREMENT PRIMARY KEY,

    -- @Column(name = "nome", nullable = false, unique = true), String nome
    nome VARCHAR(255) NOT NULL UNIQUE,

    -- @Column(name = "descricao", columnDefinition = "TEXT"), String descricao
    descricao TEXT,

    -- @NotBlank, @Column(name = "responsavel"), String responsavel
    -- @NotBlank implica que não pode ser nulo
    responsavel VARCHAR(255) NOT NULL,

    -- @Size(max = 150), @Column(name = "email"), String email
    -- O @Size(max=150) define o tamanho do VARCHAR
    email VARCHAR(150)
);