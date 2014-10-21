package socio;

import java.util.Scanner;

public class main {
    
    public static void main(String args[]) {
        int tipoSocio;
        Scanner entranda = new Scanner(System.in);
        
        System.out.println("Qual é o tipo de sócio: ");
        tipoSocio = entranda.nextInt();
        
        switch(tipoSocio) {
            case 1:
                Socio s = new Socio();
                
                System.out.print("Infome o nome do socio: ");
                s.setNomeTitular(entranda.next());
                
                System.out.print("Infome o sobrenome do socio: ");
                s.setSobrenomeTitular(entranda.next());
                
                System.out.print("Deseja usar a academica: ");
                if (entranda.nextInt() == 1) {
                    s.setOpcAcademia(20);
                }
                
                System.out.print("Deseja alugar um aarmario: ");
                if (entranda.nextInt() == 1) {
                    s.setOpcAluguelArmario(10);
                }
                
                s.calculaMensalidade();
                s.exibeDados();
                
                break;
                
            case 2:
                SocioFamilia sf = new SocioFamilia();
                
                System.out.print("Infome o nome do socio: ");
                sf.setNomeTitular(entranda.next());
                
                System.out.print("Infome o sobrenome do socio: ");
                sf.setSobrenomeTitular(entranda.next());
                
                System.out.print("Informe a quantidade de dependentes: ");
                sf.setQtdeDependentes(entranda.nextInt());
                
                System.out.print("Deseja usar a academica: ");
                if (entranda.nextInt() == 1) {
                    int totalAcademia;
                    
                    totalAcademia = 20 * sf.getQtdeDependentes();
                    sf.setOpcAcademia(totalAcademia);
                }
                
                System.out.print("Deseja alugar um aarmario: ");
                if (entranda.nextInt() == 1) {
                    sf.setOpcAluguelArmario(10);
                }
                
                sf.calculaMensalidade();
                sf.exibeDados();
                break;
        }
    }
}
