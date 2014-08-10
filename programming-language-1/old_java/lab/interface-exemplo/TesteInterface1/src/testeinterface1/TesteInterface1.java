package testeinterface1;

public class TesteInterface1 {

    public static void main(String[] args) {
        AreaCalculavel a = new Retangulo(3, 2);
        System.out.println("Area do retangulo " + a.calculaArea());
        
        AreaCalculavel b = new Quadrado(4);
        System.out.println("Area do quadrado " + b.calculaArea());
        
        AreaCalculavel c = new Circulo(2);
        System.out.println("Area do circulo " + c.calculaArea());
    }
}
