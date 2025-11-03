CREATE TABLE tb_membro (
    -- @Id, @GeneratedValue, @Column(name = "id"), Long id
    id BIGINT AUTO_INCREMENT PRIMARY KEY,

    -- @NotBlank, @Size(max = 100), @Column(name = "nome"), String nome
    nome VARCHAR(100) NOT NULL,

    -- @Column(name = "email", nullable = false, unique = true), String email
    email VARCHAR(255) NOT NULL UNIQUE,

    -- @NotBlank, @Enumerated(EnumType.STRING), @Column(name = "genero"), GeneroEnum genero
    -- Armazena o nome do Enum (ex: "MASCULINO")
    genero VARCHAR(255) NOT NULL,

    -- @NotBlank, @Column(name = "endereco"), String endereco
    endereco VARCHAR(255) NOT NULL,

    -- @Column(name = "data_nascimento"), LocalDate dataDeNascimento
    data_nascimento DATE,

    -- @Column(name = "idade"), int idade
    idade INT,

    -- @Column(name = "data_casamento"), LocalDate dataCasamento
    data_casamento DATE,

    -- @ManyToOne, @JoinColumn(name = "ministerios_id"), MinisterioModel ministerio
    ministerios_id BIGINT,
    FOREIGN KEY (ministerios_id) REFERENCES tb_ministerio(id)
);