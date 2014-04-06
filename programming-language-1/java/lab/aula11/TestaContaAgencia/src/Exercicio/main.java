package Exercicio;

public class main {
    
    public static void main(String[] args) {
        Agencia ag = new Agencia();
        Conta cc1 = new Conta();
        Conta cc2 = new Conta();
        Conta cc3 = new Conta();
        
        cc1.agencia = ag;
        cc2.agencia = ag;
        cc3.agencia = ag;
        
        cc1.agencia.setNumero(123);
        cc2.agencia.setNumero(123);
        cc3.agencia.setNumero(123);
        
        cc1.setSaldo(10.1);
        cc2.setSaldo(10.2);
        cc3.setSaldo(10.3);
        
        // Conta 1
        System.out.println(cc1.agencia.getNumero());
        System.out.println(cc1.getSaldo());
        System.out.println("");
        
        // Conta 2
        System.out.println(cc1.agencia.getNumero());
        System.out.println(cc2.getSaldo());
        System.out.println("");
        
        // Conta 3
        System.out.println(cc1.agencia.getNumero());
        System.out.println(cc3.getSaldo());
        System.out.println("");
    } 
}
