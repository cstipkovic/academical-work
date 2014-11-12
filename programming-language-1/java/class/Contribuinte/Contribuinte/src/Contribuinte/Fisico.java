package Contribuinte;

public class Fisico extends Contribuinte {
    
    private double gastosSaude;
    private int numDep;

    public Fisico(double gastosSaude, int numDep, String nome, double rendaBruta) {
        super(nome, rendaBruta);
        this.gastosSaude = gastosSaude;
        this.numDep = numDep;
    }
    
    @Override
    public double forneceRendaLiquida() {
        return (this.getRendaBruta() - (this.gastosSaude * 2));
    }
    
    @Override
    public String toString() {
        return "";
    }
    
    public int porc() {
        
    }
}
