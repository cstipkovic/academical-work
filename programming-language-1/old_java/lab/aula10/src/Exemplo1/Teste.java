package Exemplo1;

public class Teste {
    
    public static void main (String[] args) {
        ClasseTeste pessoa;
        
        pessoa  = new ClasseTeste();
        
        pessoa.cadastro();
        pessoa.mostrar();
        
        System.out.println("=================");
        System.out.println("**** Nome: " + pessoa.nome); // é possivel acessar o atributo
        System.out.println("**** Idade: " + pessoa.idade);
    }
}
