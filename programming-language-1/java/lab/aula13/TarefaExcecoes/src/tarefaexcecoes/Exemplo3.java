// captura Exceção no divide

package tarefaexcecoes;

import java.util.Scanner;

public class Exemplo3 {

    public static int divide(int a, int b) {
        try{
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Não é possivel divisao por 0 ");
            return -1;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Introduza o primeiro número");
        num1 = sc.nextInt();
        System.out.println("Introduza o segundo número");
        num2 = sc.nextInt();
        
        int res = divide(num1, num2);
        if (res != -1) {
            System.out.println(num1 + " / " + num2 + " = " + res);
        }
    } 
}
