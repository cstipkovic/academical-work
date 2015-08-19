public class TesteAuto {

    public static void main(String args[]) {
        Automovel a = new Automovel("jipe");
        Automovel b = new Automovel("kombi");
        
        a.incrementarRodas();
        System.out.println(a + " " + b);
    }
}
