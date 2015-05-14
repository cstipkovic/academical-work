package Carro;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public String toString() {
        return marca + ":" + modelo + ":" + ano;
    }
    
}
