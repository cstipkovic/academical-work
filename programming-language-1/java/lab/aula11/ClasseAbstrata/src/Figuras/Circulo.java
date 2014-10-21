package Figuras;

public class Circulo extends Figura {
    
    public double raio;
    
    Circulo(String corPreenchimento, int espessuraLinha, String corLinha, double raio) {
        super(corPreenchimento, espessuraLinha, corLinha);
        this.raio = raio;
    }
    
    @Override
    public double calculaArea() {
        return (this.raio * this.raio * Math.PI);
    }
    
    @Override
    public double calculaPerimetro() {
        return (2.0 * Math.PI * this.raio);
    }
}
