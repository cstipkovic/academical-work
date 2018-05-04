package br.mackenzie;

import br.mackenzie.server.Server;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Master extends Server {
    
    public Master(int port) throws SocketException {
        this.port = port;
        this.udpSocket = new DatagramSocket(this.port);
    }
    
    public void run() throws IOException {
        System.out.println("-- Running Server at " + InetAddress.getLocalHost() + " --");
        String msg;
        
        while (true) {            
            byte[] buffer = new byte[256];
            DatagramPacket packet;
            packet = new DatagramPacket(buffer, buffer.length);
            
            udpSocket.receive(packet);
            msg = new String(packet.getData()).trim();
            
            System.out.println("Message from" + packet.getAddress().getHostAddress() + ": " + msg);
        }
    }    
}
