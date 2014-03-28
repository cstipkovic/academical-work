package ContaCorrente;

public class ContaCorrente {
    
    // atributos
    int conta,
        agencia;
    double saldo;
    String nomeCliente;

    // método contrutor
    public ContaCorrente(int n_conta, int n_agencia, double n_saldo, String n_nomeCliente) {
        conta  = n_conta;
        agencia = n_agencia;
        saldo = n_saldo;
        nomeCliente = n_nomeCliente;
    }
    
    // método sacar
    public int sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            return 1;
        } else {
            return 0;
        }
    }
    
    // método depositar
    public void depositar(double valor) {
        saldo = saldo + valor;
    }
    
    // método imprimir
    public void imprimir() {
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + conta);
        System.out.println("Nome Cliente: " + nomeCliente);
        System.out.println("Saldo: R$" + saldo);
    }
}
