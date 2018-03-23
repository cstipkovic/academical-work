package servidordados;

import atmdados.InterfaceBanco;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Vector;

public class Banco extends UnicastRemoteObject implements InterfaceBanco {
    private 
    
    public Banco() throws RemoteException {
        for (int i = 0; i < 10; i++) {
            this.contaUsuario.add(i);
            this.saldoUsuario.add(1000);
        }
    }
    
    @Override
    public void deposito(int conta, int valor) throws RemoteException {
        
    }

    
    @Override
    public void saque(int conta, int valor) throws RemoteException {
        
    }
    
    @Override
    public void transferencia(int conta_orig, int conta_dest, int valor) throws RemoteException {
    
    }
    
    @Override
    public int saldo(int conta) throws RemoteException {
        return 0;
    }
    
    public static void main(String[] args) throws RemoteException {
        
    }
    
}
