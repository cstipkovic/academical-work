drop table filme;
drop table ator;
drop table atendente;
drop table gerente;
drop table cliente;
drop table ingresso;
drop table sessao;
drop table sala;

create table ator (
	idator integer not null,
	nacionalidade char(45) not null,
	idade integer not null,
	primary key (idator)
);

create table filme (
	idfilme integer not null,
	titulo char(45) not null,
	duracao char(45) not null,
	classificacao integer not null,
	diretor char(45) not null,
	distibuidora char(45) not null,
	status char(45) not null,
	genero char(45) not null,
	elenco integer not null,
	primary key (idfilme),
	foreign key (elenco) references ator (idator)
);

create table gerente (
	idgerente integer not null,
	nome char(45),
	primary key (idgerente)
);

create table atendente (
	idatendente integer not null,
	nome char(45) not null,
	gerente integer not null,
	primary key (idatendente),
	foreign key (gerente) references gerente (idgerente)
);

create table cliente (
        idcliente integer not null,
        nome char(45) not null,
        beneficiario boolean not null,
        primary key (idcliente)
);

create table sala (
        idsala integer not null,
        capacidade integer not null,
        poltronaEspecialDiferenciada integer not null,
        emManutencao boolean not null,
        primary key (idsala)
);

create table sessao (
        idsessao integer not null,
        sala integer not null,
        filme integer not null,
        capacidade integer not null,
        horario integer not null,
        isFull boolean not null,
        primary key (idsessao),
        foreign key (sala) references sala (idsala),
        foreign key (filme) references filme (idfilme)
);

create table ingresso (
        idingresso integer not null,
        sessao integer not null,
        beneficiario integer not null,
        valor decimal not null,
        atendente integer not null,
        primary key (idingresso),
        foreign key (sessao) references sessao (idsessao),
        foreign key (beneficiario) references cliente (idcliente),
        foreign key (atendente) references atendente (idatendente)
);
