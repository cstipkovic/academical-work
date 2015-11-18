create table ingressos (
  id_ingresso bigint not null,
  id_jogo bigint not null,
  id_local bigint not null,
  primary key (id_ingresso),
  foreign key (id_jogo) references jogos (id_jogo),
  foreign key (id_local) references locais (id_local)
);

insert into ingressos values (1, 1, 1);
insert into ingressos values (2, 2, 2);
insert into ingressos values (3, 3, 3);
insert into ingressos values (4, 4, 4);
insert into ingressos values (5, 5, 5);
