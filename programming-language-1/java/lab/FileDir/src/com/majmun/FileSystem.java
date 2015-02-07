package com.majmun;

abstract public class FileSystem {
    private String name;
    private long size;

    public FileSystem(String name) {
        this.name = name;
        this.size = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public void printSize() {
        System.out.println(this.getSize());
    }
}
