-- Instancia de contas
create table contas (
    nro_contas bigint not null,
    saldo decimal(8,2),
    primary key (nro_contas)
);

insert into contas values (123, 500.00);
insert into contas values (124, 1000.00);
insert into contas values (125, 2500.00);

-- Instancia Titulares
create table titulares (
    nro_titular bigint not null,
    nome varchar(255) not null, 
    rg varchar(32) not null,
    cpf varchar(32) not null,
    primary key (nro_titular)
);

insert into titulares values (2, 'Marco Antonio', '22333444', '09988877765');
insert into titulares values (3, 'Rosimeire', '22333444', '09988877765');
insert into titulares values (4, 'Marco Antonio', '22333444', '09988877765');
insert into titulares values (5, 'Marco Antonio', '22333444', '09988877765');

-- Instancia contas_titulares
create table contas_titulares (
    nro_conta bigint not null,
    nro_titular bigint not null,
    primary key (nro_conta, nro_titular)
);

insert into contas_titulares values (123, 2);
insert into contas_titulares values (124, 3);
insert into contas_titulares values (124, 5);
insert into contas_titulares values (125, 4);

