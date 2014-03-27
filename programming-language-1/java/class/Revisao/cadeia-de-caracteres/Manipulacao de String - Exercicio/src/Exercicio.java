public class Exercicio {
    
    public static boolean alowedLengthChacteres (String s, int characteresSize) {
        if (s.length() <= characteresSize) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void getCharPositions (String s) {
        
    }
    
    public static void main (String[] args) {
        String s = "lsjfal;ij feiafjal;e ifjasliejf ail;sejf ail;sejfa ;seafliejfal ;siejfia uheuaslhfeku fs";
        
        System.out.println(alowedLengthChacteres(s, 255));
    }
}
