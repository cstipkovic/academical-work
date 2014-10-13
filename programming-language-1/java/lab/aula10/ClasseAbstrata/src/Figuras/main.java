package Figuras;

public class main {
    
    public static void main(String args[]) {
        
        Figura [] figura = new Figura [3];
        
        Circulo c = new Circulo(10);
        Quadrado q = new Quadrado(3);
        Triangulo t = new Triangulo(10, 10);
        
        figura[0] = c;
        figura[1] = q;
        figura[2] = t;
        
        for (int i = 0; i < figura.length; i++) {
            System.out.println(figura[i].toString());
        }
    }
}
