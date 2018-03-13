package br.mack.rmi.server;

import br.mack.rmi.IExemplo;
import br.mack.rmi.impl.ExemploImpl;
import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiServer {
    public static void main(String[] args) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        
        try {
            IExemplo exemplo = new ExemploImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("exemplormi", exemplo);
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw (RuntimeException) e;
            }
            System.out.println("" + e);
        }
    }
}
