package AtividadeAnimal;

public class Peixe extends Animal{
    private String caracteristica;
    
    public Peixe(String nome, String caracteristica, int comprimento, float velocidade) {
        super(nome, "cinzenta", "mar", comprimento, velocidade, 0);
        this.caracteristica = caracteristica;
    }
    
    public void alteraCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    
    public String caracteristica() {
        return this.caracteristica;
    }
    
    public void dados() {
        super.dados();
        System.out.println("Caracteristica: " + this.caracteristica);
    }
}
