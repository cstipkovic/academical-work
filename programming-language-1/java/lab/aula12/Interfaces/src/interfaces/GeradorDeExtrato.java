package interfaces;

public class GeradorDeExtrato {
    
    public void geraExtrato(Conta c) {
        System.out.println("Extrato");
        System.out.println("Saldo: " + c.getSaldo());
    }
}
