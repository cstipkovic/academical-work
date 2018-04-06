package atmdados;

public class ATMDados {    
    
    public static void main(String[] args) {

        BancoProxy bp = new BancoProxy();
        System.out.println("O saldo de sua conta é "+bp.getSaldo("1"));
  
        System.out.println(" Deposito de 500 ");
        bp.setSaldo("1","500f");
        
        System.out.println("O saldo de sua conta é "+bp.getSaldo("1"));
        
        //System.out.println("O saldo de sua conta é "+bp.getSaldo("1"));
        
        System.out.println("Transferência da conta 1 para 2 de 200");
        bp.transferencia("1", "2", "200f");
        
        System.out.println("O saldo de sua conta 1 é "+bp.getSaldo("1"));
        System.out.println("O saldo de sua conta 2 é "+bp.getSaldo("2"));
        
        
      
        System.out.println("Saque de 500 ");
        bp.saque("2","500f");
        
        System.out.println("O saldo de sua conta é "+bp.getSaldo("2"));        
    }  
}
