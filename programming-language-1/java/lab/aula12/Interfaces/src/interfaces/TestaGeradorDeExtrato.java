package interfaces;

public class TestaGeradorDeExtrato {
    
    public static void main (String args[]) {
        ContaCorrente c1 = new ContaCorrente();
        Poupanca c2 = new Poupanca();
        
        c1.deposita(500);
        c2.deposita(500);
        
        GeradorDeExtrato g = new GeradorDeExtrato();
        g.geraExtrato(c1);
        g.geraExtrato(c2);
    }
}
