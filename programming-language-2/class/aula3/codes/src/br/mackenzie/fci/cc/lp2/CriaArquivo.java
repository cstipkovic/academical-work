package br.mackenzie.fci.cc.lp2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;

public class CriaArquivo {

    public static void main(String args[]) {

        PrintWriter pw;
        try {
            pw = new PrintWriter("meu_arquivo.txt");
            pw.println("Teste");
            pw.println(new Date());
            pw.flush();
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
