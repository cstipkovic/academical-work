package exercicio8;


import java.util.Scanner;

public class Exerccio8 {

    private static Scanner entrada = new Scanner(System.in);
    
    public static void main(String args[]) {
        boolean finalizar = false;
        
        while (!finalizar) {            
            System.out.println("MENU INICIAL:");
            System.out.println("(1) Fornecer infermacoes do download");
            System.out.println("(2) Finalizar");
            
            int opcao = entrada.nextInt();
            
            switch (opcao) {
                case 1: 
                    menuDownload(); 
                    break;
                    
                case 2:
                    finalizar = true;
                    break;
                    
                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }
    
    private static void menuDownload () {
        System.out.println("Infomacao do download");
        System.out.print(" - URL do arquivo a ser baixado");
        String url = entrada.nextLine();
        
        System.out.println(" - Pasta local onde o arquivo ...");
        String pasta = entrada.nextLine();
        
        Runnable r = new RunnableDownload(url, pasta);
        Thread t = new Thread(r);
        t.start();
    }
}
