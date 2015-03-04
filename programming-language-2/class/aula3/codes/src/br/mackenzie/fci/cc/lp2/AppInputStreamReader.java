package br.mackenzie.fci.cc.lp2;

import sun.tools.tree.InstanceOfExpression;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppInputStreamReader {

    public static void main(String args[]) throws FileNotFoundException, IOException {

        FileInputStream fis = new FileInputStream("entrada.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        char[] cbuf = new char[100];
        isr.read(cbuf);
        System.out.println(cbuf);
    }
}
