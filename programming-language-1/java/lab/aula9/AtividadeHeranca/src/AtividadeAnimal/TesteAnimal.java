package AtividadeAnimal;

public class TesteAnimal {

    public static void main(String args[]) {
        Animal zoo[] = new Animal[3];
        
        Mamifero camelo = new Mamifero("Camelo", "amarelo", "capim", 150, 2);
        Peixe tubarao = new Peixe("Tubarao", "barbatana e cauda", 300, 1.5f);
        Mamifero ursoDoCanada = new Mamifero("Urso-do-Canada", "Vermelho", "Mel", 180, 0.5f);
        
        zoo[0] = camelo;
        zoo[1] = tubarao;
        zoo[2] = ursoDoCanada;
        
        for (int i = 0; i < 3; i++) {
            zoo[i].dados();
            System.out.print("\n");
        }
    }
}
