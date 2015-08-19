package Ex4;

import Ex3.SalaDadosTxt;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import projetocinema.SalaProjecao;

public class GerenciarSalasTxt {
    
    public static void main(String args[]) {
        
        int opcao;
        SalaDadosTxt sdt = new SalaDadosTxt("salas.txt");
        List<SalaProjecao> sp = new ArrayList<>();;
        
        do {            
            System.out.println("(1) Listar todas as salas.");
            System.out.println("(2) Adicionar uma sala.");
            System.out.println("(3) Sair.");
            
            System.out.print("\nInfome a opcao: ");
            Scanner sc = new Scanner(System.in);
            opcao = sc.nextInt();
            
            if (opcao == 1) {
                File fl = new File("salas.txt");
                
                if (fl.exists()) {
                    sp = sdt.lerTodos();
                    System.out.println("\n" + sp + "\n");
                } else {
                    sp = new ArrayList<>();
                }
            }
            
            if (opcao == 2) {
                System.out.print("\nCapacidade: ");
                int capacidade = sc.nextInt();
                
                System.out.print("Poltronas especiais: ");
                int poltronasEspeciais = sc.nextInt();
                
                System.out.print("Esta em manutencao(true/false): ");
                boolean emManutencao = sc.nextBoolean();
                
                System.out.print("Numero da sala: ");
                int numero = sc.nextInt();
                
                SalaProjecao novaSala = new SalaProjecao(capacidade, poltronasEspeciais, emManutencao, numero);
                
                sp.add(novaSala);
                
                sdt.salvar(sp);
            }
            
        } while (opcao != 3);
    }
}
