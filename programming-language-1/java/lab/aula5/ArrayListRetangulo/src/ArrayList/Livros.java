package ArrayList;

public class Livros {
    
    public String ISBN;
    public String titulo;
    public String autor;

    public void exibeLivros() {
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("titulo: " + this.titulo);
        System.out.println("autor: " + this.autor);
    }
}
