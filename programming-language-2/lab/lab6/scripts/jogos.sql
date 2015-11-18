create table jogos (
  id_jogo bigint not null,
  id_equipe1 bigint not null,
  id_equipe2 bigint not null,
  id_local bigint not null,
  data date not null,
  primary key (id_jogo),
  foreign key (id_equipe1) references equipes (id_equipe),
  foreign key (id_equipe2) references equipes (id_equipe),
  foreign key (id_local) references locais (id_local)
);

insert into jogos values (1, 1, 5, 1, 2015-01-01);
insert into jogos values (2, 2, 1, 2, 2015-01-02);
insert into jogos values (3, 3, 2, 3, 2015-01-03);
insert into jogos values (4, 4, 3, 4, 2015-01-04);
insert into jogos values (5, 5, 4, 5, 2015-01-05);
