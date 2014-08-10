package heranca;

public class Secretaria extends Funcionario {
    private int ramal;
    
    public void setRamal(int n_ramal) {
        ramal = n_ramal;
    }
    
    public int getRamal() {
        return ramal;
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Ramal: " + this.getRamal());
    }
}
