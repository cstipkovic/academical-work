public class Exemplo {
    
    public static boolean contem (String s, String t) {
        return s.contains(t);
    }
    
    public static void main (String[] args) {
        String s = "Linguagem de Programcao I";
        String t = "Linguagem";
        
        System.out.println(contem(s, t));
    }
}