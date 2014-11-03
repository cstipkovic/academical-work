package exemplos;

public class Quadrado implements Medidas {
    
    private double lado;
    
    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    public Quadrado(int i) {
        this.lado = i;
    }
    
    @Override
    public double perimetro() {
        return (4 * lado);
    }
    
    @Override
    public double area() {
        return (lado * lado);
    }
}
