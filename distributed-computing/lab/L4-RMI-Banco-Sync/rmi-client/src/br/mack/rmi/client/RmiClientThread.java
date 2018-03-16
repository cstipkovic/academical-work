package br.mack.rmi.client;

import br.mack.rmi.IBanco;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RmiClientThread {
    public static void main(String[] args) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        
        try {
//            Registry registry = LocateRegistry.getRegistry("172.16.2.125");
            Registry registry = LocateRegistry.getRegistry("localhost");
            IBanco banco = (IBanco) registry.lookup("bancormi");
            
            saqueThread(banco, 1, 100);
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw (RuntimeException) e;
            }
            
            System.out.println("" + e);
        }
    }
    
    public static void saqueThread(IBanco b, int conta, int valor) throws RemoteException {
        System.out.println("Inicio " + b.saldo(conta));
        
        Thread t0 = new Thread() {
            @Override
            public void run() {
                try {
                    b.saque(conta, valor);
                } catch (RemoteException ex) {
                    Logger.getLogger(RmiClientThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        
        Thread t1 = new Thread() {
            @Override
            public void run() {
                try {
                    b.saque(conta, valor);
                } catch (RemoteException ex) {
                    Logger.getLogger(RmiClientThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        
        t0.start();
        t1.start();
        
        System.out.println("Fim " + b.saldo(conta));
    }
}
