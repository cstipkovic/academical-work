package Exercicio;

public class Editora {
    
    private String nome;
    private String cnpj;
    private Livro livros[];
    private int indiceVetorLivros;
    
    public Editora(String nome, String cnpj, int qtLivros, int init) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = new Livro[qtLivros];
        this.indiceVetorLivros = init;
    }
    
    public String listaLivros() {
        String listaLivros = "";
        
        for (int i = 0; i < this.livros.length; i++) {
            listaLivros += "Titulo: " + this.livros[i].titulo + 
                    "\nAutor: " + this.livros[i].autor + 
                    "\nAno: " + this.livros[i].ano + "\n";
        }
        return listaLivros;
    }
}
