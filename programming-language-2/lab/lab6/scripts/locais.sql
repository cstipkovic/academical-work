create table locais (
  id_local bigint not null,
  cidade varchar(255) not null,
  estado varchar(255) not null,
  arq_padrao int not null,
  arq_inferior int not null,
  arq_numerada int not null,
  arq_camarote int not null,
  primary key (id_local)
);

insert into locais values(1, 'sao paulo', 'sp', 1000, 0, 0, 0);
insert into locais values(2, 'sao paulo', 'sp', 2000, 0, 0, 0);
insert into locais values(3, 'sao paulo', 'sp', 3000, 0, 0, 0);
insert into locais values(4, 'sao paulo', 'sp', 4000, 0, 0, 0);
insert into locais values(5, 'sao paulo', 'sp', 5000, 0, 0, 0);
