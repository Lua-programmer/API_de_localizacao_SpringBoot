create table tb_cidade (
    id_cidade bigint not null primary key,
    nome_cidade varchar(50) not null,
    qtd_habitantes bigint
);

insert into tb_cidade(id_cidade, nome_cidade, qtd_habitantes) values
                                                           (1, 'São Paulo', 16465463584),
                                                           (2, 'Rio de Janeiro', 546546181);