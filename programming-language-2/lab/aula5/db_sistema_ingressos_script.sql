-- Entidade Sala
create table salas (
    nro_sala bigint not null,
    capacidade int not null,
    qt_poltrona_especial int not null,
    em_manutencao boolean,
    primary key (nro_sala)
);

insert into salas values (1, 100, 10, false);
insert into salas values (2, 200, 20, false);
insert into salas values (3, 300, 30, false);
insert into salas values (4, 400, 40, true);
