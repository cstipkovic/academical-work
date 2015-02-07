package com.majmun;

import java.util.ArrayList;

public class Folder extends FileSystem {

    private ArrayList<FileSystem> fileSystems;

    public Folder(String nome) {
        super(nome);
        fileSystems = new ArrayList<FileSystem>();
    }

    public void addContent(FileSystem f) {
        this.fileSystems.add(f);
    }

    @Override
    public void printSize() {
        long folderSize = 0;

        for (int i = 0; i < this.fileSystems.size(); i++) {
            folderSize += this.fileSystems.get(i).getSize();
        }

        System.out.println(folderSize);
    }

    public int getQtFileSystem() {
        return this.fileSystems.size();
    }
}
