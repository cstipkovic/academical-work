package br.mackenzie;

import br.mackenzie.server.Server;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Slave extends Server {
    
    private Scanner scanner;
    private InetAddress masterAddress;
    
    public Slave(String destinationAddr, int port) throws SocketException, UnknownHostException {
        masterAddress = InetAddress.getByName(destinationAddr);
        this.port = port;
        this.udpSocket = new DatagramSocket(this.port);
        scanner = new Scanner(System.in);
    }
    
    public int run() {
        String in;
        
        while (true) {            
            in = scanner.nextLine();
            
            DatagramPacket dp;
            dp = new DatagramPacket(in.getBytes(), in.getBytes().length, masterAddress, port);
        }
    }
}
