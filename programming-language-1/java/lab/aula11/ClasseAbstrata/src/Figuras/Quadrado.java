package Figuras;

public class Quadrado extends Figura {
    
    public double lado;
    
    Quadrado(String corPreenchimento, int espessuraLinha, String corLinha, double lado) {
        super(corPreenchimento, espessuraLinha, corLinha);
        this.lado = lado;
    }
    
    @Override
    public double calculaArea() {
        return (this.lado * this.lado);
    }
    
    @Override
    public double calculaPerimetro() {
        return (4.0 * this.lado);
    }
}
