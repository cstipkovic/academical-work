package Figuras;

public abstract class Figura {
    
    public String corPreenchimento;
    public int espessuraLinha;
    public String corLinha;
    
    Figura(String corPreenchimento, int espessuraLinha, String corLinha) {
        this.corPreenchimento = corPreenchimento;
        this.espessuraLinha = espessuraLinha;
        this.corLinha = corLinha;
    }
    
    public double calculaArea() {
        return 0;
    }
    
    public double calculaPerimetro() {
        return 0;
    }
}
