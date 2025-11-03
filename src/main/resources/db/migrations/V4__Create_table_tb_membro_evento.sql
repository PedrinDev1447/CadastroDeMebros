CREATE TABLE tb_membro_evento (
    -- Coluna definida em @JoinColumn(name = "id_membro")
    -- Deve referenciar a chave primária de tb_membro (que é 'id')
    id_membro BIGINT NOT NULL,

    -- Coluna definida em @JoinColumn(name = "id_evento")
    -- Deve referenciar a chave primária de tb_evento (que é 'id_evento')
    id_evento BIGINT NOT NULL,

    -- Definindo as chaves estrangeiras
    FOREIGN KEY (id_membro) REFERENCES tb_membro(id),
    FOREIGN KEY (id_evento) REFERENCES tb_evento(id_evento),

    -- Define uma chave primária composta
    -- Isso garante que um membro não possa se inscrever no mesmo evento duas vezes
    PRIMARY KEY (id_membro, id_evento)
);