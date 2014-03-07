package ContaBancaria;

public class ContaBancaria {
    private float saldo;
    
    public ContaBancaria () {
        saldo = 0.0f;
    }
    
    public ContaBancaria (float stric) {
        saldo = stric;
    }
    
    public float depositar (float quantia) {
        saldo = saldo + quantia;
        
        return saldo;
    }
    
    public float sacar (float quantia) {
        saldo = saldo - quantia;
        
        return saldo;
    }
    
    public float consultar () {
        return saldo;
    }
}
