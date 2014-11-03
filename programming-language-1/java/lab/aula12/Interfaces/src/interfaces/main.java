package interfaces;

public class main {
    
    public static void main(String args[]) {
        ContaCorrente c = new ContaCorrente();
        Poupanca p = new Poupanca();
        
        c.deposita(10);
        System.out.println("Saldo Corrente: " + c.getSaldo());
        c.saca(5);
        System.out.println("Saldo Corrente: " + c.getSaldo());
        
        p.deposita(50);
        System.out.println("Saldo Poucança: " + p.getSaldo());
        p.saca(2);
        System.out.println("Saldo Poupança: " + p.getSaldo());
    }
}
