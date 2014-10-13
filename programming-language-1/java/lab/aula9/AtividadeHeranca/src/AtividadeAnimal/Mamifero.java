package AtividadeAnimal;

public class Mamifero extends Animal {
    private String alimento;
//    private String ambiente = "terra";
    
    
    public Mamifero(String nome, String cor, String alimento, int comprimento, float velocidade, int patas) {
        super(nome, cor, "terra", comprimento, velocidade, patas);
        this.alimento = alimento;
    }
    
    public Mamifero(String nome, String cor, String alimento, int comprimento, float velocidade) {
        super(nome, cor, "terra", comprimento, velocidade);
        this.alimento = alimento;
    }
    
    public void alteraAlimento(String alimento) {
        this.alimento = alimento;
    }
    
    public String alimento() {
        return this.alimento;
    }
    
    public void dados() {
        super.dados();
        System.out.println("Alimento: " + this.alimento);
    }
}
