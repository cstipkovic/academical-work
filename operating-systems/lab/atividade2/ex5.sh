#!/bin/bash
 
echo "Informe o nome:";
read nome
 
if [ -d $nome ]; then
    echo "É um diretório";
    ls -la
elif [ -r $nome ]; then
    echo "Não é um diretório, é um arquivo.";
    cat $nome
else
    echo "Não é um diretório, arquivo não existe no diretório atual.";
fi
