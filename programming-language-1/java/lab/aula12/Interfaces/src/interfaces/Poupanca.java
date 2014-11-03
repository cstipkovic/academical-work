package interfaces;

public class Poupanca implements Conta {
    
    private double saldo;
    private double taxaPorOperacao = 0.45;
    
    @Override
    public void deposita(double valor) {
        this.saldo += valor;
    }
    
    @Override
    public void saca(double valor) {
        this.saldo -= valor;        
    }
    
    @Override
    public double getSaldo(){
        return this.saldo;
    }
}
