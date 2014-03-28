import java.util.Scanner;

public class Calculadora {
    double somar (int num1, int num2) {
        return (num1 + num2);
    }
    
    double subtrair (int num1, int num2) {
        return (num1 - num2);
    }
    
    double multiplicar (int num1, int num2) {
        return (num1 * num2);
    }
    
    double dividir (int num1, int num2) {
        return (num1 / (double) num2);
    }
    
    public static void main (String[] args) {
        int num1,
            num2,
            opcao;        
        
        Scanner ent = new Scanner(System.in);
        
        System.out.println("1. Somar\n2. Subtrair\n3. Multiplicar\n4. Dividir\n");
        
        System.out.print("Informe a operacao que deseja realizar:");
        opcao = ent.nextInt();
        
        Calculadora calc = new Calculadora();
        
        switch (opcao) {
            case 1:
                System.out.print("Informe o valor de num1:");
                num1 = ent.nextInt();

                System.out.print("Informe o valor de num2:");
                num2 = ent.nextInt();
                
                System.out.println("resultado: " + calc.somar(num1, num2));
                break;
           
            case 2:
                System.out.print("Informe o valor de num1:");
                num1 = ent.nextInt();

                System.out.print("Informe o valor de num2:");
                num2 = ent.nextInt();
                
                System.out.println("resultado: " + calc.subtrair(num1, num2));
                break;
                
            case 3:
                System.out.print("Informe o valor de num1:");
                num1 = ent.nextInt();

                System.out.print("Informe o valor de num2:");
                num2 = ent.nextInt();
                
                System.out.println("resultado: " + calc.multiplicar(num1, num2));
                break;
                
            case 4:
                System.out.print("Informe o valor de num1:");
                num1 = ent.nextInt();

                System.out.print("Informe o valor de num2:");
                num2 = ent.nextInt();
                
                System.out.println("resultado: " + calc.dividir(num1, num2));
                break;
                
            default:
                System.out.println("Opcao nao existe. Obrigado!");
        }
            
        
    }
}
