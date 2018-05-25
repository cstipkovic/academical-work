package br.mackenzie.clocksync;

public class main {
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        if (args.length >= 4) {
            String type = args[0];
            if (type.equals("-m") || type.equals("-s")) {

                String ip = args[1].split(":")[0];
                int port = Integer.parseInt(args[1].split(":")[1]);
                String time = args[2];
                String slavesFile = "";
                int d = 0;
                if (type.equals("-m")) {
                     d = Integer.parseInt(args[3]);
                     slavesFile = args[4];
                }
                String logFile = args[args.length - 1];
                
                if (type.equals("-m")) {
                    UDPMaster.start(ip, port, time, d, slavesFile, logFile);
                } else {
                    UDPSlave.start(ip, port, time , logFile);
                }
                

            } else {
                System.out.println("Esperava o tipo: -m ou -s");
            }
        } else {
            System.out.println("Informe os argumentos necessarios.");
        }

    }
}