package br.mackenzie.fci.cc.lp2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by cstipkovic on 2/25/15.
 */
public class AppFileOutputSream {

    public static void main(String args[]) throws FileNotFoundException, IOException {

        FileOutputStream fos;
        fos = new FileOutputStream("saida.txt");
        fos.write(76);
        fos.write(80);
        fos.write(73);
        fos.write(73);
        fos.close();
    }
}
