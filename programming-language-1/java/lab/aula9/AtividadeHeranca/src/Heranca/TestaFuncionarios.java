package Heranca;

import java.util.Scanner;

public class TestaFuncionarios {
    
    public static void main (String args[]) {
        Scanner entrada = new Scanner(System.in);
        
        Gerente g = new Gerente();
        System.out.println("Informe o nome do gerente");
        g.setNome(entrada.next());
        System.out.println("Informe o salario");
        g.setSalario(entrada.nextInt());
        System.out.println("Informe o usuario");
        g.setUsuario(entrada.next());
        System.out.println("Informe o senha");
        g.setSenha(entrada.next());
               
        Telefonista t = new Telefonista();
        System.out.println("Informe o nome do(a) telefonista");
        t.setNome(entrada.next());
        System.out.println("Informe o salario");
        t.setSalario(entrada.nextInt());
        System.out.println("Informe a estacao de trabalho");
        t.setEstacaoDeTrabalho(entrada.nextInt());
//        
        Secretaria s = new Secretaria();
        System.out.println("Informe o nome do(a) secretario(a)");
        s.setNome(entrada.next());
        System.out.println("Informe o salario");
        s.setSalario(entrada.nextInt());
        System.out.println("Informe o ramal");
        s.setRamal(entrada.nextInt());
        
        System.out.println("GERENTE");
        g.mostraDados();

        System.out.println("TELEFONISTA");
        t.mostraDados();

        System.out.println("SECRETARIA");
        s.mostraDados();
    }
}
