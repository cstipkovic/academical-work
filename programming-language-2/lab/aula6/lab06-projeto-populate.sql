-- Ator
insert into ator values (1, 'brasileiro', 21);
insert into ator values (2, 'brasileiro', 22);
insert into ator values (3, 'brasileiro', 32);
insert into ator values (4, 'brasileiro', 43);
insert into ator values (5, 'brasileiro', 52);

-- Filme 
insert into filme values (1, 'filme 1', '1h', 0, 'o diretor', 'panini', 'em breve', 'ação', 1);
insert into filme values (2, 'filme 2', '2h', 0, 'o diretor', 'panini', 'em breve', 'ação', 2);
insert into filme values (3, 'filme 3', '1h', 14, 'o diretor', 'VHS', 'em cartaz', 'drama', 1);
insert into filme values (4, 'filme 4', '3h', 0, 'o diretor', 'panini', 'em breve', 'comedia', 3);
insert into filme values (5, 'filme 5', '1h30', 14, 'o diretor', 'panini', 'em breve', 'ação', 5);

-- Gerente
insert into gerente values (1, 'gerente 1');
insert into gerente values (2, 'gerente 2');
insert into gerente values (3, 'gerente 3');
insert into gerente values (4, 'gerente 4');
insert into gerente values (5, 'gerente 5');

-- Atendente 
insert into atendente values (1, 'atendente 1', 1);
insert into atendente values (2, 'atendente 2', 1);
insert into atendente values (3, 'atendente 3', 2);
insert into atendente values (4, 'atendente 4', 5);
insert into atendente values (5, 'atendente 5', 4);

-- Cliente
insert into cliente values (1, 'cliente 1', true);
insert into cliente values (2, 'cliente 2', true);
insert into cliente values (3, 'cliente 3', false);
insert into cliente values (4, 'cliente 4', true);
insert into cliente values (5, 'cliente 5', false);

-- Sala
insert into sala values (1, 10, 1, false);
insert into sala values (2, 20, 2, true);
insert into sala values (3, 30, 3, false);
insert into sala values (4, 40, 4, false);
insert into sala values (5, 50, 5, true);

-- Sessao
insert into sessao values (1, 1, 1, 10, 13, false);
insert into sessao values (2, 2, 1, 20, 20, false);
insert into sessao values (3, 3, 3, 30, 10, false);
insert into sessao values (4, 4, 5, 40, 15, false);
insert into sessao values (5, 5, 4, 50, 20, false);

-- Ingresso
insert into ingresso values (1, 1, 1, 11, 1);
insert into ingresso values (2, 2, 2, 12, 2);
insert into ingresso values (3, 3, 3, 13, 3);
insert into ingresso values (4, 4, 4, 14, 4);
insert into ingresso values (5, 5, 5, 15, 5);

