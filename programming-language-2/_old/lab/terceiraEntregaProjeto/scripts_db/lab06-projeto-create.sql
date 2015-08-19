drop table filme;
drop table ator;
drop table atendente;
drop table gerente;
drop table cliente;
drop table ingresso;
drop table sessao;
drop table sala;

create table ator (
	id integer not null,
	nome char(45) not null,
	nacionalidade char(45) not null,
	idade integer not null,
	primary key (id)
);

create table filme (
	id integer not null,
	titulo char(45) not null,
	duracao char(45) not null,
	classificacao integer not null,
	diretor char(45) not null,
	distribuidora char(45) not null,
	status char(45) not null,
	genero char(45) not null,
	idator integer not null,
	primary key (id),
	foreign key (idator) references ator (id)
);

create table gerente (
	id integer not null,
	nome char(45),
	primary key (id)
);

create table atendente (
	id integer not null,
	nome char(45) not null,
	idgerente integer not null,
	primary key (id),
	foreign key (idgerente) references gerente (id)
);

create table cliente (
        id integer not null,
        nome char(45) not null,
        beneficiario boolean not null,
        primary key (id)
);

create table sala (
        id integer not null,
        capacidade integer not null,
        poltronaEspecialDiferenciada integer not null,
        emManutencao boolean not null,
        primary key (id)
);

create table sessao (
        id integer not null,
		idsala integer not null,
        idfilme integer not null,
        capacidade integer not null,
        horario date not null,
        isFull boolean not null,
        primary key (id),
        foreign key (idsala) references sala (id),
        foreign key (idfilme) references filme (id)
);

create table ingresso (
        id integer not null,
        idsessao integer not null,
        idbeneficiario integer not null,
        valor decimal not null,
        idatendente integer not null,
        primary key (id),
        foreign key (idsessao) references sessao (id),
        foreign key (idbeneficiario) references cliente (id),
        foreign key (idatendente) references atendente (id)
);
