# Compile the Class and Main files
compile:
	# Classes
	g++ -Wall -g -c ./classes/Figura.cpp
	g++ -Wall -g -c ./classes/Retangulo.cpp
	g++ -Wall -g -c ./classes/Circulo.cpp
	g++ -Wall -g -c ./classes/Paralelepipedo.cpp
	g++ -Wall -g -c ./classes/Esfera.cpp

	# Main
	g++ -Wall -g -c main.cpp

	# Geral
	g++ -g Figura.o Retangulo.o Circulo.o Paralelepipedo.o Esfera.o main.o -lm -o main
	# g++ -g Figura.o Circulo.o Esfera.o main.o -lm -o main
	# g++ -g main.o -lm -o main