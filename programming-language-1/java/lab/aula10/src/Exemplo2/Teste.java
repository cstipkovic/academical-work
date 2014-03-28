package Exemplo2;

public class Teste {
    
    public static void main(String[] args) {
        ClasseTeste pessoa;
        pessoa = new ClasseTeste();
        
        pessoa.cadastro();
        pessoa.mostrar();
        
        System.out.println("==============");
        System.out.println("**** Nome: " + pessoa.getNome()); // só é possível por meio de um método
        System.out.println("**** Idade: " + pessoa.getIdade());
        
        pessoa.setNome();
        System.out.println("**** Nome: " + pessoa.getNome());
        
        System.out.println("**** idade: " + pessoa.mudaIdade());
    }
}
