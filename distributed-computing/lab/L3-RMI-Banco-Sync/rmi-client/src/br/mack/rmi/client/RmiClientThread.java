package br.mack.rmi.client;

import br.mack.rmi.IBanco;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiClientThread {
    public static void main(String[] args) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        
        try {
//            Registry registry = LocateRegistry.getRegistry("172.16.2.125");
            Registry registry = LocateRegistry.getRegistry("localhost");
            IBanco banco = (IBanco) registry.lookup("bancormi");
            
            imprimeTransacoes(banco, 1, 2, 150);
            System.out.println("");
            
            imprimeTransacoes(banco, 2, 7, 1000);
            System.out.println("");
            
            imprimeTransacoes(banco, 8, 1, 50);
            System.out.println("");
            
            saqueThread(banco, 1, 100);
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw (RuntimeException) e;
            }
            
            System.out.println("" + e);
        }
    }
    
    public static void imprimeTransacoes(IBanco b, int c1, int c2, float v) throws RemoteException {
        System.out.println("Saldo cta(" + c1 + ") = " + b.saldo(c1) + ", cta(" + c2 + ") = " + b.saldo(c2) + ".");
        
        System.out.println("Transferencia cta(" + c1 + ") para cta(" + c2 + ") no valor = " + v);
        b.transferencia(c1, c2, (int) v);
        
        System.out.println("Saldo cta(" + c1 + ") = " + b.saldo(c1) + ", cta(" + c2 + ") = " + b.saldo(c2) + ".");
    }
    
    public static void saqueThread(IBanco b, int conta, int valor) throws RemoteException {
        Thread t = new Thread(b.saque(conta, valor));
        t.start();
    }
}
