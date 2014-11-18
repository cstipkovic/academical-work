package Contribuinte;

public class main {
    
    public static void main(String args[]) {
        Juridico pj11 = new Juridico(100.00, "PJ11", 90000.00);
        Juridico pj12 = new Juridico(150.00, "PJ12", 350000.00);
        System.out.println("Pessoa Juridica");
        System.out.println(pj11);
        System.out.println(pj12);
        
        Contribuinte pf21 = new Fisico(50, 2, "PF21", 9000.00);
        Contribuinte pf22 = new Fisico(100, 1, "PF22", 35000.00);
        System.out.println("\nPessoa Fisica");
        System.out.println(pf21);
        System.out.println(pf22);
        
    }
}
