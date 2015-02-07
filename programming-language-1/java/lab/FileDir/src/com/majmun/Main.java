package com.majmun;

public class Main {

    public static void main(String[] args) {
        File fi1 = new File("arquivo1");
        fi1.setSize(10);
        fi1.printSize();

        File fi2 = new File("arquivo2");
        fi1.setSize(20);

        File fi3 = new File("arquivo3");
        fi1.setSize(30);

        Folder fo1 = new Folder("pasta1");
        Folder fo2 = new Folder("pasta2");

        fo1.addContent(fi1);
        fo1.addContent(fi2);
        fo1.addContent(fo2);

        fo1.printSize();
        System.out.println(fo1.getQtFileSystem());
    }
}
