package Debitos;

public class Debitos {
    
    private String dono;
    private double saldo;
    private double limite;
    private double deposita;
    private boolean bloqueado = true;
    
    public Debitos() {
        this.dono = "seu nome";
        this.saldo = 100;
        this.limite = 100;
        this.deposita =  0;
        this.bloqueado = true;
    }
    
    public Debitos(String dono, double saldo, double limite, double deposita) {
        this.dono = dono;
        this.saldo = saldo;
        this.limite = limite;
        this.deposita = deposita;
    }
    
    public boolean desbloqueia() {
        this.bloqueado = false;
        System.out.print("Cartão desbloqueado.");
        
        return false;
    }
    
    public void sacar(double valorSaque) {
        System.out.println("Saldo antes do saque: " + this.saldo);
        System.out.println("Dono: " + this.dono);
        System.out.println("Valor do saque: " + valorSaque);
        
        if ((this.bloqueado == false) && (valorSaque <= (this.saldo + this.limite))) {
            if (valorSaque <= this.saldo) {
                this.saldo = this.saldo - valorSaque;
            } else {                
                valorSaque = valorSaque - this.saldo;
                this.saldo = 0;
                this.limite = this.limite - valorSaque;                
            }
        }
        
        System.out.println("Saldo após o saque: " + this.saldo);
    }
    
    public void depositar(double valorDeposito) {
        System.out.println("Saldo antes do saque: " + this.saldo);
        System.out.println("Dono: " + this.dono);
        System.out.println("Valor do depósito: " + valorDeposito);
        
        if (valorDeposito > 0) {
            this.deposita = valorDeposito;
            this.saldo += valorDeposito;
        }
        
        System.out.println("Saldo após o depósito: " + this.saldo);
    }
    
    public String getDono() {
        return this.dono;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public double getLimite() {
        return this.limite;
    }
    
    public double getDeposita() {
        return this.deposita;
    }
    
    public boolean getBloqueado() {
        return this.bloqueado;
    }
}
