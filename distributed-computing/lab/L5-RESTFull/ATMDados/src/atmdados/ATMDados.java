package atmdados;

public class ATMDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BancoProxy bp = new BancoProxy();
        System.out.println("O saldo de sua conta é " + bp.getSaldo());
        
        System.out.println("Deposito de 500.");
        bp.setSaldo("500");
        
        System.out.println("O saldo de sua conta é " + bp.getSaldo());
    }
    
}
