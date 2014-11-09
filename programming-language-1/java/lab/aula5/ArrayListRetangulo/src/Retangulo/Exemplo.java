package Retangulo;

import java.awt.Rectangle;

public class Exemplo {
    
    public static void main(String args[]) {
        Rectangle s = new Rectangle(0, 0, -1, -1);
        Rectangle t = new Rectangle(2, 2, -1, -1);
        
        interseccao(s, t);
    }
    
    public static Rectangle interseccao(Rectangle s, Rectangle t){
        Rectangle intersc = s.intersection(t);
        
        return intersc;
    }
}
