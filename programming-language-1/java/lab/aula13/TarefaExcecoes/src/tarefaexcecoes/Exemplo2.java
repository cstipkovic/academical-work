// Tratamento de exceção no main

package tarefaexcecoes;

import java.util.Scanner;

public class Exemplo2 {

    public static int divide(int a, int b) {
        return a / b;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Introduza o primeiro número");
        num1 = sc.nextInt();
        
        System.out.println("Introduza o segundo número");
        num2 = sc.nextInt();
        
        try {
            System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("impossivel divisão por zero");
        }
   }
}
