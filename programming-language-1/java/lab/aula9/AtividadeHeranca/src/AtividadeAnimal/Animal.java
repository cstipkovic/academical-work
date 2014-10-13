package AtividadeAnimal;

public class Animal {
    private String nome;
    private int comprimento;
    private int patas = 4;
    private String cor;
    private String ambiente;
    private float velocidade;
    
    public Animal(String nome, String cor, String ambiente, int comprimento, float velocidade, int patas) {
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.comprimento = comprimento;
        this.velocidade = velocidade;
        this.patas = patas;
    }
    
    public Animal(String nome, String cor, String ambiente, int comprimento, float velocidade) {
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.comprimento = comprimento;
        this.velocidade = velocidade;
    }
    
    public void alteraNome(String nome) {
        this.nome = nome;
    }
    
    public void alteraComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
    
    public void alteraPatas(int patas) {
        this.patas = patas;
    }
    
    public void alteraCor(String cor) {
        this.cor = cor;
    }
    
    public void alteraAmbiente(String ambinete) {
        this.ambiente = ambinete;
    }
    
    public void alteraVelocidade (float velocidade) {
        this.velocidade = velocidade;
    }
    
    public void dados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Comprimento: " + this.comprimento + " cm");
        System.out.println("Patas: " + this.patas);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ambiente: " + this.ambiente);
        System.out.println("Velocidade: " + this.velocidade + " m/s");
    }
}
