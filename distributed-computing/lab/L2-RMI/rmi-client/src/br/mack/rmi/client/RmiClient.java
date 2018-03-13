package br.mack.rmi.client;

import br.mack.rmi.IExemplo;
import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiClient {
    public static void main(String[] args) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        
        try {
            Registry registry = LocateRegistry.getRegistry("172.16.2.128");
            IExemplo exemplo = (IExemplo) registry.lookup("exemplormi");
            
            System.out.println(exemplo.metodo1());
            exemplo.metodo2("Adeus!");
            System.out.println(exemplo.metodo1());
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw (RuntimeException) e;
            }
            
            System.out.println("" + e);
        }
    }
}
