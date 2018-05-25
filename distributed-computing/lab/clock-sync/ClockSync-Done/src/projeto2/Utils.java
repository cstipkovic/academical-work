package projeto2;

import Models.Client;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rabahzeineddine
 */
public class Utils {

    private static SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

    public static ArrayList<Client> ReadClients(String fileName) {

        ArrayList<Client> clients = null;

        try {
            if (new File(fileName).exists()) {
                FileReader data = new FileReader(fileName);
                BufferedReader buffer = new BufferedReader(data);
                String line;
                clients = new ArrayList<Client>();
                while ((line = buffer.readLine()) != null) {
                    String ip = line.split(":")[0];
                    int port = Integer.parseInt(line.split(":")[1]);
                    clients.add(new Client(InetAddress.getByName(ip), port));
                }
                data.close();
            } else {
                System.out.println("Adicione o arquivo de " + fileName);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clients;
    }

    public static Date getLocalTime(String time) {

        Date date = null;
        try {
            date = format.parse(time);
        } catch (ParseException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }

        return date;
    }

    public static String getTimeFromDate(Date date) {
        String time = "";
        time = format.format(date);
        return time;
    }

    public static boolean checkValidDate(int diff, int d) {
        boolean valid = false;

        if (diff <= 0 && diff + d >= 0 && diff + d <= d) {
            valid = true;
        } else if (diff > 0 && diff - d >= -d && diff - d <= 0) {
            valid = true;
        }

        return valid;
    }

    public static int addMinutes(int org, int additional) {
        return (org + additional >= 60) ? (org + additional - 60) : org + additional;

    }

    public static Date addMinToDate(Date date, int timeDiffFromMaster) {
        Date resultDate = null;

        Calendar aux = Calendar.getInstance();
        aux.setTime(date);
        aux.add(Calendar.MINUTE, timeDiffFromMaster);
        resultDate = aux.getTime();

        return resultDate;
    }

    public static int getTimeDifference(Date localDate, Date clientDate) {
        int diff = 0;

        Calendar aux = Calendar.getInstance();
        aux.setTime(clientDate);
        int client_hour = aux.get(Calendar.HOUR_OF_DAY);
        int client_minutes = aux.get(Calendar.MINUTE);

        aux.setTime(localDate);
        int master_hour = aux.get(Calendar.HOUR_OF_DAY);
        int master_minutes = aux.get(Calendar.MINUTE);
        // Calcular a diferena entre os horarios.
        int hrs_diff = client_hour - master_hour; // diferenca de horas
        diff = (hrs_diff * 60) + (client_minutes - master_minutes);

        return diff;
    }

    public static void Log(String msg, String fileName) {

        System.out.println(msg);
        FileWriter fileWriter = null;
        BufferedWriter bw = null;

        try {

            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fileWriter);

            bw.write("[ " + new Date().toString() + " ] : " + msg + "\n");
        } catch (IOException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }

            } catch (IOException ex) {
                Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static void cleanLog(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }

    }

}
