# Compile the Class and Main files
compile:
	# Classes
	g++ -Wall -g -c ./classes/Banco/Banco.cpp
	g++ -Wall -g -c ./classes/Conta/Conta.cpp
	g++ -Wall -g -c ./classes/ContaEspecial/ContaEspecial.cpp

	# Main
	g++ -Wall -g -c main.cpp

	# Geral
	g++ -g Banco.o Conta.o ContaEspecial.o main.o -lm -o main