package Contribuinte;

public abstract class Contribuinte {
    
    private String nome;
    private double rendaBruta;
    
    Contribuinte(String nome, double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }
    
    public abstract double forneceRendaLiquida();

    public double getRendaBruta() {
        return rendaBruta;
    }
    
    @Override
    public String toString() {
        return "";
    }
}
