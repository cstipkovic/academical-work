package br.mackenzie.fci.cc.lp2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AppBytesDisponiveis {

    public static void main(String args[]) throws FileNotFoundException, IOException {

        FileInputStream fis = new FileInputStream("entrada.txt");

        System.out.println("Primeiro valor lido: " + fis.read());

        int leitura = fis.read();
        System.out.println("Segundo valor lido: " + leitura);

        int b = fis.available();
        System.out.println("Bytes disponiveis: " + b);
        fis.close();
    }
}
