package exemplos;

public class Circulo implements Medidas {
    
    private double raio;

    Circulo(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double perimetro() {
        return (2 * PI * raio);
    } 
    
    @Override
    public double area() {
        return (PI * raio * raio);
    }
}
