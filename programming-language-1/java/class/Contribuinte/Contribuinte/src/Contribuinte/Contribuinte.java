package Contribuinte;

public abstract class Contribuinte {
    
    private String nome;
    private double rendaBruta;
    
    Contribuinte(String nome, double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }
    
    public abstract double forneceRendaLiquida();
    
    public abstract double calculaImposto();
    
    @Override
    public abstract String toString();

    public double getRendaBruta() {
        return this.rendaBruta;
    }

    public String getNome() {
        return this.nome;
    }
}
