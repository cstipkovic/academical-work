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
}
