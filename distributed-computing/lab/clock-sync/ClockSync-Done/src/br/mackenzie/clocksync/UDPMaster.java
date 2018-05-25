package br.mackenzie.clocksync;

import Models.Client;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Date;

public class UDPMaster {

private static ArrayList<Client> clients;

    public static void start(String ip, int port, String time, int d, String slavesFile, String logFile) throws Exception {
        Utils.cleanLog(logFile);
        Date localTime = Utils.getLocalTime(time); // o tempo local do master

        double avg = 0; // a media calcuada pelo master
        int avg_denominador = 1;

        clients = Utils.ReadClients(slavesFile); // A lista dos clientes ( escravos )

        if (clients.size() > 0) {

            DatagramSocket serverSocket = new DatagramSocket(port, InetAddress.getByName(ip));
            serverSocket.setSoTimeout(10000);

            byte[] receiveData = new byte[1024];
            byte[] sendData;

            Utils.Log("Servidor está rodando..", logFile);
            Utils.Log("Tempo local no servidor:  " + Utils.getTimeFromDate(localTime), logFile);
            while (true) {

                // Solicitar o tempo de cada cliente.
                for (Client client : clients) {
                    String msg = "SENDTIME";
                    sendData = msg.getBytes();
                    Utils.Log("Sending SENDTIME to " + client.getIp().toString() + ":" + client.getPort(), logFile);
                    DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, client.getIp(), client.getPort());
                    serverSocket.send(sendPacket);

                    try {
                        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                        serverSocket.receive(receivePacket);
                        msg = new String(receivePacket.getData()).trim();
                        Utils.Log("Received: " + msg, logFile);
                        client.setDateFromString(msg.split("=")[1]);
                        client.setActive(true);
                    } catch (SocketTimeoutException e) {
                        client.setActive(false);

                    }
                }

                for (Client client : clients) {
                    if (client.isActive()) {
                        int diff = Utils.getTimeDifference(localTime, client.getDate());
                        client.setTimeDifference(diff);
                        boolean valid = Utils.checkValidDate(diff, d);
                        if (valid) {
                            avg_denominador++;
                            avg += diff;
                        }
                        client.setValid(valid);
                    }
                }

                avg = avg / avg_denominador;
                Utils.Log("Average: " + avg, logFile);

                Date master_aux_date = Utils.addMinToDate(localTime, (int) Math.round(avg));

                for (Client client : clients) {
                    if (client.isActive()) {
                        String msg = "SYNCTIME:" + Utils.getTimeDifference(master_aux_date, client.getDate());
                        sendData = msg.getBytes();
                        Utils.Log(msg, logFile);
                        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, client.getIp(), client.getPort());
                        serverSocket.send(sendPacket);

                    }
                }
                localTime = master_aux_date;
                Utils.Log("Tempo local no servidor foi alterado para: " + Utils.getTimeFromDate(localTime), logFile);

                Thread.sleep(5000);
                avg = 0;
                avg_denominador  = 1;
            }
        }
    }    
}
