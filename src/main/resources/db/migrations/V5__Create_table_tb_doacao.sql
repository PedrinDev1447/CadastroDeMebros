CREATE TABLE tb_doacoes (
    -- @Id, @GeneratedValue(strategy = GenerationType.IDENTITY), @Column(name = "id")
    id BIGINT AUTO_INCREMENT PRIMARY KEY,

    -- @Enumerated(EnumType.STRING), @Column(name = "tipo_doacao", nullable = false)
    -- Usamos VARCHAR para armazenar o texto do Enum (ex: "DIZIMO")
    tipo_doacao VARCHAR(100) NOT NULL,

    -- @Column(name = "valor_doacao", nullable = false)
    -- DECIMAL(10, 2) é ideal para dinheiro (ex: 99999999.99)
    valor_doacao DECIMAL(10, 2) NOT NULL,

    -- @Column(name = "data_doacao", nullable = false)
    -- LocalDate vira DATE no SQL
    data_doacao DATE NOT NULL,

    -- @Column(name = "doacao_anonima", nullable = false), private boolean anonimo = false;
    -- BOOLEAN com valor padrão 'false'
    doacao_anonima BOOLEAN DEFAULT false NOT NULL,

    -- @ManyToOne, @JoinColumn(name = "membro_id", nullable = true)
    -- Chave estrangeira para a tabela tb_membro
    membro_id BIGINT,
    FOREIGN KEY (membro_id) REFERENCES tb_membro(id)
);