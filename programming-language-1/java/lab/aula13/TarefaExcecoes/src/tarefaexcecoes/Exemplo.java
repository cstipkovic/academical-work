package tarefaexcecoes;

import java.util.Scanner;

public class Exemplo {
    
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String codigo; 
        char zona;
        int distrito, valido = 0;
        
        System.out.print ("Codigo do Produto (XXX para sair): ");
        codigo = sc.next();
        while (!codigo.equals("XXX")) {
            try  {
                zona = codigo.charAt(2);
                distrito = Integer.parseInt(codigo.substring(3, 5));
                System.out.println ("Distrito " + distrito);
                valido++;
            } catch (StringIndexOutOfBoundsException exception) {
                System.out.println ("comprimento errado: " + codigo);
            } catch (NumberFormatException exception) {
                System.out.println ("Distrito não é numérico: " + codigo);
            }
            
            System.out.print (" Codigo do Produto (XXX para sair): ");
            codigo = sc.next();
        }
        
        System.out.println ("Codigos validos: " + valido);
    }
}
