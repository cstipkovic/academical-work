package Contribuinte;

public class Juridico extends Contribuinte {
    
    private double gastosPessoal;

    public Juridico(double gastosPessoal, String nome, double rendaBruta) {
        super(nome, rendaBruta);
        this.gastosPessoal = gastosPessoal;
    }

    @Override
    public double forneceRendaLiquida() {
        return (this.getRendaBruta() - this.gastosPessoal);
    }
    
    @Override
    public double calculaImposto() {
        double rl = this.forneceRendaLiquida();
        
        if (rl < 100000.00) {
            return (rl * 0.05);
        } else if ((rl >= 100000.00) && (rl < 200000.00)) {
            return ((rl * 0.1) - 5000.00);
        } else {
            return ((rl * 0.25) - 45000.00);
        }
    }
    
    @Override
    public String toString() {
        return ("Nome: " + super.getNome() + " - RL: " + this.forneceRendaLiquida() + " - Imposto: " + this.calculaImposto());
    }
}
