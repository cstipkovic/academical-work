package Heranca;

public class Secretaria extends Funcionario {
    
    private int ramal;

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
    public void mostraDados() {
        super.mostraDados();
        System.out.println("ramal: " + this.getRamal());
    }
    
}
