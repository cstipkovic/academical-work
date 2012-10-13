# Compile the Class and Main files
compile:
	g++ -Wall -g -c Usuario.cpp
	g++ -Wall -g -c Aluno.cpp
	g++ -Wall -g -c Funcionario.cpp

	g++ -Wall -g -c Obra.cpp
	g++ -Wall -g -c Livro.cpp
	g++ -Wall -g -c Periodico.cpp
	g++ -Wall -g -c Academico.cpp

	# Main contendo teste de cadastro
	g++ -Wall -g -c main.cpp
	g++ -g Usuario.o Aluno.o Funcionario.o Obra.o Livro.o Periodico.o Academico.o main.o -lm -o main

	# Main contendo teste de busca
	g++ -Wall -g -c mainBusca.cpp
	g++ -g Usuario.o Aluno.o Funcionario.o Obra.o Livro.o Periodico.o Academico.o mainBusca.o -lm -o mainBusca