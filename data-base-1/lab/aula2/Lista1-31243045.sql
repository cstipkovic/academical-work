-- Nome: Clauber Stipkovic TIA: 3124304-5

CREATE TABLE Departamento (
  Cod_Depto INTEGER NOT NULL, 
  Nome_Depto VARCHAR(15) NOT NULL,
  PRIMARY KEY(Cod_Depto)
);

CREATE TABLE Funcionario (
  Cod_Func INTEGER NOT NULL,
  Nome_Func VARCHAR(15) NOT NULL,
  Salario INTEGER,
  Cod_Depto INTEGER NOT NULL,
  PRIMARY KEY(Cod_Func),
  FOREIGN KEY(Cod_Depto) REFERENCES Departamento(Cod_Depto)
);

CREATE TABLE Projeto (
  Cod_Proj INTEGER NOT NULL,
  Nome_Proj VARCHAR(15) NOT NULL,
  Duracao INTEGER,
  PRIMARY KEY(Cod_Proj)
);

CREATE TABLE Func_Proj (
  Cod_Func INTEGER NOT NULL, 
  Cod_Proj INTEGER NOT NULL, 
  Horas_Trab INTEGER,
  PRIMARY KEY(Cod_Func, Cod_Proj),
  FOREIGN KEY(Cod_Func) REFERENCES Funcionario(Cod_Func),
  FOREIGN KEY(Cod_Proj) REFERENCES Projeto(Cod_Proj)
);