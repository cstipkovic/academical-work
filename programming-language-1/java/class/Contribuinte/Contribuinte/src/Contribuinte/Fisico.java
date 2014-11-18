package Contribuinte;

public class Fisico extends Contribuinte {
    
    private double gastosSaude;
    private int numDep;

    public Fisico(double gastosSaude, int numDep, String nome, double rendaBruta) {
        super(nome, rendaBruta);
        
        if (numDep > 4) {
            this.numDep = 4;
        } else {
            this.numDep = numDep;
        }
        
        if (gastosSaude > 5000.00) {
            this.gastosSaude = 5000.00;
        } else {
            this.gastosSaude = gastosSaude;
        }
    }
    
    @Override
    public double forneceRendaLiquida() {
        return (this.getRendaBruta() - this.gastosSaude - (this.numDep * 1500.00));
    }
    
    @Override
    public double calculaImposto() {
        double rl = this.forneceRendaLiquida();
        
        if (rl < 10000.00) {
            return 0;
        } else if ((rl >= 10000.00) && (rl < 20000.00)) {
            return ((rl * 0.1) - 1000.00);
        } else {
            return ((rl * 0.25) - 4000.00);
        }
    }
    
    @Override
    public String toString() {
        return ("Nome: " + super.getNome() + " - RL: " + this.forneceRendaLiquida() + " - Imposto: " + this.calculaImposto());
    }
}
