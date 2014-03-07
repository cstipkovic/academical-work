// Clauber Pereira Stipkovic Halic - 31243045
// 06/03/2014

package Exemplo;

import java.util.Scanner;

public class Livro {
    // atributos da classe
    String isbn;
    String titulo;
    String autor;
    
    // metodo para cadastrar os dados do livro do tipo Livros (retorna um objeto tipo Livros)
    static Livro cadastraLivro() {
        Livro avulso = new Livro();
        
        Scanner ent = new Scanner(System.in);
        
        System.out.println ("Digite o ISBN do livro: "); 
        avulso.isbn = ent.nextLine(); 
        System.out.println ("Digite o título do livro: "); 
        avulso.titulo = ent.nextLine(); 
        System.out.println ("Digite o autor do livro: "); 
        avulso.autor = ent.nextLine(); 
        return avulso; 
    } 
    
    // método para exibir os dados do livro do tipo void (nada é retornado) 
    void exibeLivro(){ 
        System.out.println ("Dados do Livro");
        System.out.println ("==============");
        System.out.println ("ISBN: " + isbn);
        System.out.println ("Título: " + titulo);
        System.out.println ("Autor: " + autor);
    }
 
    public static void main(String[] args) { 
        Livro livrolido = new Livro(); // criar objeto tipo da classe 
        livrolido = cadastraLivro(); // chamada do método cadastraLivro 
        livrolido.exibeLivro(); // chamada do método exibeLivros 
    }
}
