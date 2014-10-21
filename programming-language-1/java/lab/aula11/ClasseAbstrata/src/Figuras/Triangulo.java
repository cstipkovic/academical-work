package Figuras;

public class Triangulo extends Figura {
    
    public double base;
    public double altura;
    
    Triangulo(String corPreenchimento, int espessuraLinha, String corLinha, double base, double altura) {
        super(corPreenchimento, espessuraLinha, corLinha);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calculaArea() {
        return (this.base * this.altura) / 2.0;
    }
    
    @Override
    public double calculaPerimetro() {
        return (3.0 * this.base);
    }
}
