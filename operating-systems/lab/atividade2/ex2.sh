#!bin/bash

echo "Informe seu nome: ";
read username

echo "Informe o valor de x: ";
read x

y=$(((3*x)-1))

echo "$username, o resultado da expressao y=3x-1 é: $y"
