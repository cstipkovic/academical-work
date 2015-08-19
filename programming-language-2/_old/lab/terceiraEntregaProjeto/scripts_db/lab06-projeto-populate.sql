-- Ator
insert into ator values (1, 'Ator 1', 'Brasileiro', 21);
insert into ator values (2, 'Ator 2', 'Sul Africano', 22);
insert into ator values (3, 'Ator 3', 'Inglês', 32);
insert into ator values (4, 'Ator 4', 'Croata', 43);
insert into ator values (5, 'Ator 5', 'Japonês', 52);

-- Filme 
insert into filme values (1, 'filme 1', '1h', 0, 'Diretor', 'panini', 'em breve', 'ação', 1);
insert into filme values (2, 'filme 2', '2h', 0, 'Diretor', 'panini', 'em breve', 'ação', 2);
insert into filme values (3, 'filme 3', '1h', 14, 'Diretor', 'VHS', 'em cartaz', 'drama', 1);
insert into filme values (4, 'filme 4', '3h', 0, 'Diretor', 'panini', 'em breve', 'comedia', 3);
insert into filme values (5, 'filme 5', '1h30', 14, 'Diretor', 'panini', 'em breve', 'ação', 5);

-- Gerente
insert into gerente values (1, 'Gerente 1');
insert into gerente values (2, 'Gerente 2');
insert into gerente values (3, 'Gerente 3');
insert into gerente values (4, 'Gerente 4');
insert into gerente values (5, 'Gerente 5');

-- Atendente 
insert into atendente values (1, 'Atendente 1', 1);
insert into atendente values (2, 'Atendente 2', 1);
insert into atendente values (3, 'Atendente 3', 2);
insert into atendente values (4, 'Atendente 4', 5);
insert into atendente values (5, 'Atendente 5', 4);

-- Cliente
insert into cliente values (1, 'Cliente 1', true);
insert into cliente values (2, 'Cliente 2', true);
insert into cliente values (3, 'Cliente 3', false);
insert into cliente values (4, 'Cliente 4', true);
insert into cliente values (5, 'Cliente 5', false);

-- Sala
insert into sala values (1, 10, 1, false);
insert into sala values (2, 20, 2, true);
insert into sala values (3, 30, 3, false);
insert into sala values (4, 40, 4, false);
insert into sala values (5, 50, 5, true);

-- Sessao
insert into sessao values (1, 1, 1, 10, '2015-06-01', false);
insert into sessao values (2, 2, 1, 20, '2015-06-02', false);
insert into sessao values (3, 3, 3, 30, '2015-06-03', false);
insert into sessao values (4, 4, 5, 40, '2015-06-04', false);
insert into sessao values (5, 5, 4, 50, '2015-06-05', false);

-- Ingresso
insert into ingresso values (1, 1, 1, 11, 1);
insert into ingresso values (2, 2, 2, 12, 2);
insert into ingresso values (3, 3, 3, 13, 3);
insert into ingresso values (4, 4, 4, 14, 4);
insert into ingresso values (5, 5, 5, 15, 5);

