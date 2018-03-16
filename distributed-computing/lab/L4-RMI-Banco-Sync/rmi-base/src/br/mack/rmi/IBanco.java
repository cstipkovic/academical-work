package br.mack.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IBanco extends Remote {
    public void deposito(int conta, int valor) throws RemoteException;
    public void saque(int conta, int valor) throws RemoteException;
    public void transferencia(int conta_orig, int conta_dest, int valor) throws RemoteException;
    public float saldo(int conta) throws RemoteException;
}
