package br.mackenzie.fci.cc.lp2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AppFileReader {

    public static void main(String args[]) throws FileNotFoundException, IOException {

        FileReader fr = new FileReader("entrada.txt");
        char[] cbuf = new char[100];
        fr.read(cbuf);
        System.out.printf(cbuf);
        fr.close();
    }
}
