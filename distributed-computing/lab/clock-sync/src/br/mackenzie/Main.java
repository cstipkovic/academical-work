package br.mackenzie;

import br.mackenzie.master.MasterServer;

import java.net.SocketException;

public class Main {

    public static void main(String[] args) throws SocketException {
        MasterServer ms = new MasterServer();

        ms.run();
    }
}
