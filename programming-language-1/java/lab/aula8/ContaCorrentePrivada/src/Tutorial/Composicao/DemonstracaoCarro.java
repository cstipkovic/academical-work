package Tutorial.Composicao;

public class DemonstracaoCarro {
    
    public static void main(String args[]) {
    
        Motor m1 = new Motor("3.8L V6");

        Carro c1 = new Carro("Mustang", "Conversível", "Ford");
        Motor m2 = new Motor("Zetec Rocam 1.0");

        Carro c2 = new Carro("Ka", "Popular", "Ford");
        System.out.println(
                c1.retornaFabricante() + " " +
                c1.retornaMarca() + " " + 
                c1.retornaModelo() + " " +
                m1.retornaTipo()
        );
        
        System.out.println(
                c2.retornaFabricante() + " " + 
                c2.retornaMarca() + " " +
                c2.retornaModelo() + " " +
                m2.retornaTipo()
        );
    }
}