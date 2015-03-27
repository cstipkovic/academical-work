-- eliminação das tabelas
DROP TABLE Func_Proj CASCADE CONSTRAINT;
DROP TABLE Projeto CASCADE CONSTRAINT;
DROP TABLE Funcionario CASCADE CONSTRAINT;
DROP TABLE Departamento CASCADE CONSTRAINT;

-- criação das tabelas
CREATE TABLE Departamento (
  Cod_Depto INTEGER, 
  Nome_Depto VARCHAR(20)NOT NULL, 
  PRIMARY KEY(Cod_Depto)
);

CREATE TABLE Funcionario (
  Cod_Func INTEGER, 
  Nome_Func VARCHAR(20) NOT NULL, 
  Salario INTEGER, 
  Cod_Depto INTEGER, 
  PRIMARY KEY(Cod_Func),
  FOREIGN KEY (Cod_Depto) REFERENCES Departamento (Cod_Depto)
);

CREATE TABLE Projeto (
  Cod_Proj INTEGER, 
  Nome_Proj VARCHAR(20) NOT NULL, 
  Duracao INTEGER, 
  PRIMARY KEY(Cod_Proj)
);

CREATE TABLE Func_Proj ( 
  Cod_Func INTEGER, 
  Cod_Proj INTEGER, 
  Horas_Trab INTEGER, 
  PRIMARY KEY(Cod_Func, Cod_Proj),
  FOREIGN KEY (Cod_Func) REFERENCES Funcionario(Cod_Func),
  FOREIGN KEY (Cod_Proj) REFERENCES Projeto(Cod_Proj)
);

-- Departamento
INSERT INTO departamento(cod_depto, nome_depto) VALUES(1, 'Marketing');
INSERT INTO departamento(cod_depto, nome_depto) VALUES(2, 'Vendas');
INSERT INTO departamento(cod_depto, nome_depto) VALUES(3, 'Dados');
INSERT INTO departamento(cod_depto, nome_depto) VALUES(4, 'Pesquisa');

-- Funcionario
INSERT INTO funcionario(cod_depto, cod_func, nome_func, salario) VALUES(2, 101,'Joao da Silva Santos', 2000);
INSERT INTO funcionario(cod_depto, cod_func, nome_func, salario) VALUES(1, 102,'Mario Souza', 1500);
INSERT INTO funcionario(cod_depto, cod_func, nome_func, salario) VALUES(2, 103,'Sergio Silva Santos', 2400);
INSERT INTO funcionario(cod_depto, cod_func, nome_func, salario) VALUES(1, 104,'Maria Castro', 1200);
INSERT INTO funcionario(cod_depto, cod_func, nome_func, salario) VALUES(4, 105,'Marcio Silva Santana', 1400);

-- Projeto
INSERT INTO projeto(cod_proj, duracao, nome_proj) VALUES(1001, 2, 'SistemaA');
INSERT INTO projeto(cod_proj, duracao, nome_proj) VALUES(1002, 6, 'SistemaB');
INSERT INTO projeto(cod_proj, duracao, nome_proj) VALUES(1003, 4, 'SistemaX');

-- Func_Proj
INSERT INTO func_proj(cod_func, cod_proj, horas_trab) VALUES(101, 1001, 24);
INSERT INTO func_proj(cod_func, cod_proj, horas_trab) VALUES(101, 1002, 160);
INSERT INTO func_proj(cod_func, cod_proj, horas_trab) VALUES(102, 1001, 56);
INSERT INTO func_proj(cod_func, cod_proj, horas_trab) VALUES(102, 1003, 45);
INSERT INTO func_proj(cod_func, cod_proj, horas_trab) VALUES(103, 1001, 86);
INSERT INTO func_proj(cod_func, cod_proj, horas_trab) VALUES(103, 1003, 64);
INSERT INTO func_proj(cod_func, cod_proj, horas_trab) VALUES(104, 1001, 46);
INSERT INTO func_proj(cod_func, cod_proj, horas_trab) VALUES(105, 1001, 84);
INSERT INTO func_proj(cod_func, cod_proj, horas_trab) VALUES(105, 1002, 86);

