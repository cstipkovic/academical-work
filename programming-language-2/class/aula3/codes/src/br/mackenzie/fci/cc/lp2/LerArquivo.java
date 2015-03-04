package br.mackenzie.fci.cc.lp2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LerArquivo {

    public static void main(String args[]) {

        File arquivo = new File("meu_arquivo.txt");
        if (arquivo.exists()) {
            System.out.println("Arquivo existe");
        } else {
            System.out.println("Arquivo não existe");
        }

        if (arquivo.isDirectory()) {
            System.out.println("É um diretório");
        } else {
            System.out.println("Não é um diretório");
        }

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(arquivo));
            String primeiraLinha = reader.readLine();
            System.out.println("Primeira linha: " + primeiraLinha);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
