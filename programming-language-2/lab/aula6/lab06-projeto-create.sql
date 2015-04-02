drop table filme;
drop table ator;

create table ator (
	idator integer not null,
	nacionalidade char(45),
	idade integer,
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
	foreign key (elenco) references
		ator (idator)
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
	foreign key (gerente)
		gerente (idgerente)
);

