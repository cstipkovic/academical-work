package br.mackenzie.server;

import java.net.DatagramSocket;
import java.net.InetAddress;

public abstract class Server {
    
    public DatagramSocket udpSocket;
    public int port;
}
