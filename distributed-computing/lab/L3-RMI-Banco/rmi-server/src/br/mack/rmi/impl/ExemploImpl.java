package br.mack.rmi.impl;

import br.mack.rmi.IExemplo;
import java.rmi.RemoteException;

public class ExemploImpl 
        extends java.rmi.server.UnicastRemoteObject
        implements IExemplo {
    
    private String msg = "Bem vindo ao Mack!";
    
    public ExemploImpl() throws RemoteException {
        super();
    }
    
    public String metodo1() throws RemoteException {
        return msg;
    }
    
    public void metodo2(String param) throws RemoteException {
        msg = param;
    }
}
