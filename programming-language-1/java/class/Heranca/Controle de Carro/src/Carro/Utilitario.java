package Carro;

public class Utilitario extends Automovel {
    private int capacidade;
    private double altura;

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double consumo() {
        return 1.0;
    }
    
    @Override
    public String toString() {
        return "";
    }
}
