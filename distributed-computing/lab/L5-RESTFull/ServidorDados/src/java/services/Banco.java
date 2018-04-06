package services;

import java.util.HashMap;

public class Banco implements IBanco {

    public static HashMap<Integer, Float> contas = new HashMap<>();
    
    public Banco() {
        for (int i = 1; i <= 10; i++) {
            contas.put(i, 1000f);         
        }
    }

    @Override
    public void deposito(Integer conta, Float valor) {
        Float saldo = contas.get(conta);
        
        if (saldo != null) {
            saldo += valor;
        }
        
        contas.put(conta, saldo);
    }

    @Override
    public void saque(Integer conta, Float valor) {
        synchronized (this) {
            Float saldo = contas.get(conta);
            
            if (saldo != null && saldo >= valor) {
                saldo -= valor;
            }
            contas.put(conta, saldo);
        }
    }

    @Override
    public void transferencia(Integer conta_origem, Integer conta_dest, Float valor) {
        Float saldo_origem = contas.get(conta_origem);
        Float saldo_dest = contas.get(conta_dest);
        
        if (saldo_origem != null && saldo_origem >= valor) {
            saldo_origem -= valor;
            saldo_dest += valor;
        }
        
        contas.put(conta_origem, saldo_origem);
        contas.put(conta_dest, saldo_dest);
    }

    @Override
    public Float saldo(Integer conta) {
        return contas.get(conta);
    }
}
