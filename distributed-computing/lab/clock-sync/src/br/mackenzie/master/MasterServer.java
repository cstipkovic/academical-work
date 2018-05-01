package br.mackenzie.master;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class MasterServer extends Thread {

    private DatagramSocket socket;
    private boolean running;
    private byte[] buffer = new byte[256];

    public MasterServer() throws SocketException {
        socket = new DatagramSocket(4445);
    }

    public void run() {
        running = true;

        while (running) {
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            try {
                socket.receive(packet);

                InetAddress address = packet.getAddress();
                int port = packet.getPort();
                packet = new DatagramPacket(buffer,buffer.length, address, port);
                String received = new String(packet.getData(), 0, packet.getLength());

                if (received.equals("end")) {
                    running = false;
                    continue;
                }

                socket.send(packet);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        socket.close();
    }
}
