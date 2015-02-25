package br.mackenzie.fci.cc.lp2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AppFileInputStream {

    public static void main(String args[]) throws FileNotFoundException, IOException {
//        # Se desejar passar o caminho do arquivo, basta usar esse trecho de código
//        System.out.print("Informe o caminho para o arquivo: ");
//        Scanner inputPath = new Scanner(System.in);
//        String filePath = inputPath.next();
//
//        FileInputStream fis;
//        fis = new FileInputStream(filePath);

        FileInputStream fis;
        fis = new FileInputStream("entrada.txt");

        int leitura = fis.read();
        System.out.println("Primeiro valor lido: " + leitura);
        leitura = fis.read();

        System.out.println("Segundo valor lido: " + leitura);
        fis.close();
    }
}
