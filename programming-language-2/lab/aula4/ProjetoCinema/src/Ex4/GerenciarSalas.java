package Ex4;

import java.util.Scanner;

public class GerenciarSalas {

    public static void main (String args[]) {
        
        System.out.println("(1) Listar todas as salas.");
        System.out.println("(2) Adicionar uma sala.");
        System.out.println("(3) Sair.");
        
        System.out.print("\nInforme sua opcao: ");
        Scanner entrada = new Scanner(System.in);
        int opcao = entrada.nextInt();
        
        GerenciarSalas gl = new GerenciarSalas();
        
        while(opcao != 3) {
            if (opcao == 1) {
                gl.listaSalas();
            }
            
            if (opcao == 2) {
                gl.adicionaSala();
            }
        }
    }
    
    public void listaSalas() {
        
    }
    
    public void adicionaSala() {
        
    }
}
