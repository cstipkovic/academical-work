package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    
    public static void main(String args[]) {
        
        Scanner e = new Scanner(System.in);
        ArrayList<Livros> biblioteca = new ArrayList<Livros>();
        int qtLivros;
        
        System.out.print("Qt de livros que deseja cadastrar: ");
        qtLivros = e.nextInt();
        
        // Cadastra livros
        for (int i = 0; i < qtLivros; i++) {
            biblioteca.add(cadastraLivro());
            System.out.print("\n");
        }
        
        // Exibe pessoas
        System.out.println("Livros cadastrados:");
        for (int i = 0; i < biblioteca.size(); i++) {
            exibeLivros(biblioteca.get(i));
            System.out.print("\n");
        }
    }
    
    static Livros cadastraLivro() {
        Livros l = new Livros();
        Scanner e = new Scanner(System.in);
        
        System.out.print("Informe o ISBN: ");
        l.ISBN = e.next();
        
        System.out.print("Informe o titulo: ");
        l.titulo = e.next();
        
        System.out.print("Informe o autor: ");
        l.autor = e.next();
        
        return l;
    }
    
    static void exibeLivros(Livros l) {
        l.exibeLivros();
    }
}
