package br.mack.rmi.server;

import br.mack.rmi.IBanco;
import br.mack.rmi.impl.BancoImpl;
import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiServer {
    public static void main(String[] args) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        
        try {
            IBanco banco = new BancoImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("bancormi", banco);
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw (RuntimeException) e;
            }
            System.out.println("" + e);
        }
    }
}
