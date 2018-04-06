package servidordados;

import java.rmi.RemoteException;

public interface InterfaceBanco {
    public void deposito(int conta, int valor) throws RemoteException;
    public void saque(int conta, int valor) throws RemoteException;
    public void transferencia(int conta_orig, int conta_dest, int valor) throws RemoteException;
    public int saldo(int conta) throws RemoteException;
}
