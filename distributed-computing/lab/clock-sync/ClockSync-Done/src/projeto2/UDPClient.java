package projeto2;

import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.rmi.CORBA.Util;

class UDPClient {

    public static void start(String ip,int port,String time ,String logFile) throws Exception {
        Utils.cleanLog(logFile);
        Date localTime = Utils.getLocalTime(time);

        DatagramSocket clientSocket = new DatagramSocket(port);
        
        InetAddress IPAddress = InetAddress.getByName(ip);
        
        
        Utils.Log("Cliente está rodando..", logFile);
        Utils.Log("Tempo local no cliente: " + Utils.getTimeFromDate(localTime), logFile);

        while (true) {
            byte[] sendData;
            byte[] receiveData = new byte[1024];

            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);
            String serverMSG = new String(receivePacket.getData()).trim();
            Utils.Log("FROM SERVER:" + serverMSG, logFile);

            String msg = "NULL";
            if (serverMSG.equals("SENDTIME")) {
                msg = "MYTIME=" + Utils.getTimeFromDate(localTime);
                int serverPort = receivePacket.getPort();
                sendData = msg.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, serverPort);
                clientSocket.send(sendPacket);
                Utils.Log(msg, logFile);

            } else if (serverMSG.startsWith("SYNCTIME")) {
                int timeDiffFromMaster = Integer.parseInt(serverMSG.split(":")[1]);
                localTime = Utils.addMinToDate(localTime, (- timeDiffFromMaster) );
                Utils.Log("Tempo local do cliente alterado para: " + Utils.getTimeFromDate(localTime), logFile);
            }

        }
//        clientSocket.close();

    }
}
