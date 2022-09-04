create table tb_cidade (
    id_cidade bigint not null primary key,
    nome varchar(50) not null,
    qtd_habitantes bigint
);

insert into tb_cidade(id_cidade, nome, qtd_habitantes) values (1, 'São Paulo', 16465463584), (2, 'Rio de Janeiro', 5458463584),(3, 'João Pessoa', 17865463584), (4, 'Bayeux', 5865463584);
