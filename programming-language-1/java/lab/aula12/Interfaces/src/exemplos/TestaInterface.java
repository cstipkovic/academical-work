package exemplos;

public class TestaInterface {
    
    public static void main(String args[]) {
        Quadrado Q = new Quadrado(2);
        System.out.println("Quadrado lado 2");
        System.out.println("Area = " + Q.area());
        System.out.println("Perimetro = " + Q.perimetro());
        
        Circulo C = new Circulo(3);
        System.out.println("Circulo de raio 3");
        System.out.println("Area = " + C.area());
        System.out.println("Perimetro = " + C.perimetro());
    }
}
