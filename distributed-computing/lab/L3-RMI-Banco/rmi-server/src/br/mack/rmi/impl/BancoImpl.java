package br.mack.rmi.impl;

import java.rmi.RemoteException;
import br.mack.rmi.IBanco;

public class BancoImpl 
        extends java.rmi.server.UnicastRemoteObject
        implements IBanco {
    
    public float[] contas;
    
    public BancoImpl() throws RemoteException {
        super();
        contas = new float[10];
        
        for (int i = 0; i < 10; i++) {
            contas[i] = 1150;
        }
    }
    
    @Override
    public void deposito(int conta, int valor) throws RemoteException {
        float tmpValor = contas[conta];
        
        contas[conta] = tmpValor + valor;
    }

    @Override
    public void saque(int conta, int valor) throws RemoteException {
        float tmpValor = contas[conta];
        
        if (tmpValor >= valor) {
            contas[conta] = tmpValor - valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void transferencia(int conta_orig, int conta_dest, int valor) throws RemoteException {
        this.saque(conta_orig, valor);
        this.deposito(conta_dest, valor);
    }

    @Override
    public float saldo(int conta) {
        return contas[conta];
    }
}
