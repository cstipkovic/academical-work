package atmdados;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Vector;

public class Banco extends UnicastRemoteObject implements InterfaceBanco {
    private Vector contaUsuario;
    private Vector saldoUsuario;
    
    public Banco() throws RemoteException {}
    
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
        
    }
    
    public static void main(String[] args) {
        
    }
    
}
