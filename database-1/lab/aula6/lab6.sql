-- 1) Obtenha, para cada cÛdigo de cada departamento, o total gasto com sal·rio pago aos funcion·rios, bem
-- como a mÈdia salarial de cada departamento.

select cod_depto, sum(salario), avg(salario)
from funcionario
group by cod_depto;

-- 2) Obtenha somente o cÛdigo dos departamentos que possuem uma quantidade de funcion·rios entre 2 e 10
-- funcion·rios.

select cod_depto
from funcionario
group by cod_depto
having count(cod_depto) BETWEEN 2 and 10;

-- 3) Obtenha, para cada funcion·rio (considere somente o cÛdigo do funcion·rio), a quantidade total de horas
-- trabalhadas nos projetos como um todo.



-- 4) Obtenha o cÛdigo de cada projeto e a quantidade total de horas trabalhadas pelos funcion·rios em cada
-- um deles, em ordem decrescente do total de horas, mas desde que o total de horas trabalhadas no projeto seja
-- maior que 200.



-- 5) Obtenha, para cada projeto (considere somente o cÛdigo do projeto), a quantidade de funcion·rios que
-- trabalharam em cada um deles, mas desde que o n˙mero de funcion·rios por projeto seja superior a trÍs
-- funcion·rios

