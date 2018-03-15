package br.mack.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IExemplo extends Remote {
    public String metodo1() throws RemoteException;
    public void metodo2(String param) throws RemoteException;
}